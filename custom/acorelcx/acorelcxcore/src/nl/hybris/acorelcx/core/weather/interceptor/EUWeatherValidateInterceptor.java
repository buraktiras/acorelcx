package nl.hybris.acorelcx.core.weather.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import nl.hybris.acorelcx.core.constants.AcorelcxCoreConstants;
import nl.hybris.acorelcx.core.model.EUWeatherModel;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;

public class EUWeatherValidateInterceptor implements ValidateInterceptor<EUWeatherModel> {

    @Override
    public void onValidate(EUWeatherModel euWeatherModel, InterceptorContext interceptorContext) throws InterceptorException {
        final String code = euWeatherModel.getCode();
        if (BooleanUtils.isFalse(StringUtils.isAlphanumeric(code)) || code.contains(" ")) {
            throw new InterceptorException(AcorelcxCoreConstants.EU_WEATHER_INTERCEPTOR_VALIDATE_MSG);
        }
    }
}
