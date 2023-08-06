package nl.hybris.acorelcx.core.weather.dao.impl;

import de.hybris.platform.servicelayer.exceptions.ModelRemovalException;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import nl.hybris.acorelcx.core.model.EUWeatherModel;
import nl.hybris.acorelcx.core.weather.dao.EUWeatherDao;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class DefaultEUWeatherDao extends DefaultGenericDao<EUWeatherModel> implements EUWeatherDao {
    public DefaultEUWeatherDao(String typecode) {
        super(typecode);
    }

    private ModelService modelService;
    private FlexibleSearchService flexibleSearchService;


    @Override
    public void saveEuWeather(List<EUWeatherModel> weatherList) {
         modelService.saveAll(weatherList);
    }

    @Override
    public List<EUWeatherModel> getAllModel() {
        final String queryString = String.format("SELECT {PK} FROM {%s}",
                EUWeatherModel._TYPECODE);

        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

        final SearchResult<EUWeatherModel> result = getFlexibleSearchService().search(query);
        return result.getResult();
    }

    @Override
    public boolean deleteAll() {
        try {
            modelService.removeAll(getAllModel());
            return true;
        } catch (ModelRemovalException e) {
            throw new RuntimeException(e);
        }
    }


    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    @Override
    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
