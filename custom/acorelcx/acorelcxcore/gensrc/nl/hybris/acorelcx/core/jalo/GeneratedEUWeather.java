/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 5, 2023, 6:45:11 PM                     ---
 * ----------------------------------------------------------------
 */
package nl.hybris.acorelcx.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nl.hybris.acorelcx.core.constants.AcorelcxCoreConstants;

/**
 * Generated class for type {@link nl.hybris.acorelcx.core.jalo.EUWeather EUWeather}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedEUWeather extends GenericItem
{
	/** Qualifier of the <code>EUWeather.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>EUWeather.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>EUWeather.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>EUWeather.temp</code> attribute **/
	public static final String TEMP = "temp";
	/** Qualifier of the <code>EUWeather.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>EUWeather.main</code> attribute **/
	public static final String MAIN = "main";
	/** Qualifier of the <code>EUWeather.visibility</code> attribute **/
	public static final String VISIBILITY = "visibility";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(TEMP, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(MAIN, AttributeMode.INITIAL);
		tmp.put(VISIBILITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.main</code> attribute.
	 * @return the main
	 */
	public String getMain(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.main</code> attribute.
	 * @return the main
	 */
	public String getMain()
	{
		return getMain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.main</code> attribute. 
	 * @param value the main
	 */
	public void setMain(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.main</code> attribute. 
	 * @param value the main
	 */
	public void setMain(final String value)
	{
		setMain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.temp</code> attribute.
	 * @return the temp
	 */
	public Float getTemp(final SessionContext ctx)
	{
		return (Float)getProperty( ctx, TEMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.temp</code> attribute.
	 * @return the temp
	 */
	public Float getTemp()
	{
		return getTemp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.temp</code> attribute. 
	 * @return the temp
	 */
	public float getTempAsPrimitive(final SessionContext ctx)
	{
		Float value = getTemp( ctx );
		return value != null ? value.floatValue() : 0.0f;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.temp</code> attribute. 
	 * @return the temp
	 */
	public float getTempAsPrimitive()
	{
		return getTempAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.temp</code> attribute. 
	 * @param value the temp
	 */
	public void setTemp(final SessionContext ctx, final Float value)
	{
		setProperty(ctx, TEMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.temp</code> attribute. 
	 * @param value the temp
	 */
	public void setTemp(final Float value)
	{
		setTemp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.temp</code> attribute. 
	 * @param value the temp
	 */
	public void setTemp(final SessionContext ctx, final float value)
	{
		setTemp( ctx,Float.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.temp</code> attribute. 
	 * @param value the temp
	 */
	public void setTemp(final float value)
	{
		setTemp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.visibility</code> attribute.
	 * @return the visibility
	 */
	public Boolean isVisibility(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VISIBILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.visibility</code> attribute.
	 * @return the visibility
	 */
	public Boolean isVisibility()
	{
		return isVisibility( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.visibility</code> attribute. 
	 * @return the visibility
	 */
	public boolean isVisibilityAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isVisibility( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EUWeather.visibility</code> attribute. 
	 * @return the visibility
	 */
	public boolean isVisibilityAsPrimitive()
	{
		return isVisibilityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VISIBILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final Boolean value)
	{
		setVisibility( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final SessionContext ctx, final boolean value)
	{
		setVisibility( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EUWeather.visibility</code> attribute. 
	 * @param value the visibility
	 */
	public void setVisibility(final boolean value)
	{
		setVisibility( getSession().getSessionContext(), value );
	}
	
}
