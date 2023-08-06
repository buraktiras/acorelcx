package nl.hybris.acorelcx.core.weather.service;

import de.hybris.platform.servicelayer.model.ModelService;
import nl.hybris.acorelcx.core.model.EUWeatherModel;

import java.util.List;

public interface EUWeatherService {

    public void saveEuWeather(List<EUWeatherModel> weatherList);

    public boolean deleteAll();

}
