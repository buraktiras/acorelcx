/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package nl.hybris.acorelcx.core.constants;

/**
 * Global class for all AcorelcxCore constants. You can add global constants for your extension into this class.
 */
public final class AcorelcxCoreConstants extends GeneratedAcorelcxCoreConstants
{
	public static final String EXTENSIONNAME = "acorelcxcore";


	private AcorelcxCoreConstants()
	{
		//empty
	}

	// implement here constants used by this extension
	public static final String QUOTE_BUYER_PROCESS = "quote-buyer-process";
	public static final String QUOTE_SALES_REP_PROCESS = "quote-salesrep-process";
	public static final String QUOTE_USER_TYPE = "QUOTE_USER_TYPE";
	public static final String QUOTE_SELLER_APPROVER_PROCESS = "quote-seller-approval-process";
	public static final String QUOTE_TO_EXPIRE_SOON_EMAIL_PROCESS = "quote-to-expire-soon-email-process";
	public static final String QUOTE_EXPIRED_EMAIL_PROCESS = "quote-expired-email-process";
	public static final String QUOTE_POST_CANCELLATION_PROCESS = "quote-post-cancellation-process";

	public static final String WEATHER_INTERCEPTOR_REMOVE_MSG = "*Weather cannot be removed if visibility is true";
	public static final String EU_WEATHER_INTERCEPTOR_VALIDATE_MSG = "*Code should be alpha-numeric without space.";


}
