package nl.hybris.acorelcx.core.weather.job;

import com.google.gson.Gson;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import nl.hybris.acorelcx.core.model.EUWeatherListJobModel;
import nl.hybris.acorelcx.core.model.EUWeatherModel;
import nl.hybris.acorelcx.core.model.Temperature;
import nl.hybris.acorelcx.core.weather.service.impl.DefaultEUWeatherService;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EUWeatherListJob extends AbstractJobPerformable<EUWeatherListJobModel> {
    private static final Logger LOG = Logger.getLogger(EUWeatherListJob.class);

    private DefaultEUWeatherService EUWeatherService;

    @Override
    public PerformResult perform(EUWeatherListJobModel euWeatherListJobModel) {

        //List<ResultList> resultList = new ArrayList<>();
        // Create a city name list
        List<String> cities = getCitiesList();
        List<EUWeatherModel> modelList = new ArrayList<>();

        // Iterate through the list of cities and get the temperature for each city.
        for (String city : cities) {
            HttpURLConnection connection = null;
            try {
                connection = getHttpURLConnectionByCityName(city);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Get the response from the API.
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                while (reader.ready()) {
                    String response = reader.readLine();
                    // Create a Gson instance.
                    Gson gson = new Gson();
                    // Map the JSON string to a Java object.
                    Temperature temp = gson.fromJson(response, Temperature.class);

                    EUWeatherModel euWeatherModel = new EUWeatherModel();

                    euWeatherModel.setCode(alphaNumericCreater());
                    euWeatherModel.setCountry(temp.getSys().getCountry());
                    euWeatherModel.setCity(temp.getName());
                    euWeatherModel.setTemp(convertKelvinToCelcius(temp.getMain().getTemp()));
                    euWeatherModel.setDescription(temp.getWeather().get(0).getDescription());
                    euWeatherModel.setMain(temp.getWeather().get(0).getMain());

                    // Save the cronjob data to a Hybris table.

                    modelList.add(euWeatherModel);

                    //resultList = createTempListForBackoffice(temp, resultList);
                }
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(getEUWeatherService().deleteAll()){
            getEUWeatherService().saveEuWeather(modelList);
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

        }

        return new PerformResult(CronJobResult.FAILURE, CronJobStatus.ABORTED);
    }



    private static float convertKelvinToCelcius(float kelvin){
        return kelvin - 273;
    }

    private static HttpURLConnection getHttpURLConnectionByCityName(String city) throws IOException {
        // Create a URL object for the OpenWeatherMap API.
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=");
        // Add the city name to the URL.
        url = new URL(url + city + "&appid=bf2aa93c5137307c4cec2598dde8040d");
        // Create a connection to the API.
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        return connection;
    }

    private static List<String> getCitiesList() {
        // Create a list of cities in the Netherlands.
        List<String> cities = new ArrayList<>();
        cities.add("Amsterdam");
        cities.add("Rotterdam");
        cities.add("Utrecht");
        cities.add("Eindhoven");
        return cities;
    }

    public static String alphaNumericCreater() {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        String alphaNumericUUID = uuidString.replace("-", "");
        return alphaNumericUUID;
    }

    public DefaultEUWeatherService getEUWeatherService() {
        return EUWeatherService;
    }

    public void setEUWeatherService(DefaultEUWeatherService EUWeatherService) {
        this.EUWeatherService = EUWeatherService;
    }
}
