/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package nl.hybris.acorelcx.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import nl.hybris.acorelcx.core.constants.AcorelcxCoreConstants;
import nl.hybris.acorelcx.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class AcorelcxCoreManager extends GeneratedAcorelcxCoreManager
{
	public static final AcorelcxCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AcorelcxCoreManager) em.getExtension(AcorelcxCoreConstants.EXTENSIONNAME);
	}
}
