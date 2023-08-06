package nl.hybris.acorelcx.core.weather.service.impl;

import de.hybris.platform.servicelayer.model.ModelService;
import nl.hybris.acorelcx.core.model.EUWeatherModel;
import nl.hybris.acorelcx.core.weather.dao.impl.DefaultEUWeatherDao;
import nl.hybris.acorelcx.core.weather.service.EUWeatherService;

import java.util.List;

public class DefaultEUWeatherService implements EUWeatherService {

    private DefaultEUWeatherDao EUWeatherDao;

    @Override
    public void saveEuWeather(List<EUWeatherModel> weatherList) {
         getEUWeatherDao().saveEuWeather(weatherList);
    }

    @Override
    public boolean deleteAll() {
        return getEUWeatherDao().deleteAll();
    }

    public DefaultEUWeatherDao getEUWeatherDao() {
        return EUWeatherDao;
    }

    public void setEUWeatherDao(DefaultEUWeatherDao EUWeatherDao) {
        this.EUWeatherDao = EUWeatherDao;
    }
}
