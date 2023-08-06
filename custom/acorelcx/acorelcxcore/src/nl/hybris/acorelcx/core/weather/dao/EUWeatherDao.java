package nl.hybris.acorelcx.core.weather.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import nl.hybris.acorelcx.core.model.EUWeatherModel;
import java.util.List;

public interface EUWeatherDao extends Dao {
    void saveEuWeather(List<EUWeatherModel> weatherList);
    List<EUWeatherModel> getAllModel();
    boolean deleteAll();
}
