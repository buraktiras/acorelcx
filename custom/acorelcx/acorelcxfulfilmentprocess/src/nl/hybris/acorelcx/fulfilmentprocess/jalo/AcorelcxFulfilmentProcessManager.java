/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package nl.hybris.acorelcx.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import nl.hybris.acorelcx.fulfilmentprocess.constants.AcorelcxFulfilmentProcessConstants;

public class AcorelcxFulfilmentProcessManager extends GeneratedAcorelcxFulfilmentProcessManager
{
	public static final AcorelcxFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AcorelcxFulfilmentProcessManager) em.getExtension(AcorelcxFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
