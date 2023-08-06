package nl.hybris.acorelcx.core.weather.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import nl.hybris.acorelcx.core.constants.AcorelcxCoreConstants;
import nl.hybris.acorelcx.core.model.EUWeatherModel;
import org.apache.commons.lang.BooleanUtils;

public class EUWeatherRemoveInterceptor implements RemoveInterceptor<EUWeatherModel> {

    @Override
    public void onRemove(EUWeatherModel euWeatherModel, InterceptorContext interceptorContext) throws InterceptorException {
        if(BooleanUtils.isTrue(euWeatherModel.getVisibility())){
            throw new InterceptorException(AcorelcxCoreConstants.WEATHER_INTERCEPTOR_REMOVE_MSG);
        }
    }
}
