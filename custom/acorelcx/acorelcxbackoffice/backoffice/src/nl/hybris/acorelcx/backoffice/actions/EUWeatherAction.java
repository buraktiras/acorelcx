/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package nl.hybris.acorelcx.backoffice.actions;

import com.hybris.backoffice.widgets.notificationarea.NotificationService;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.CronJobService;
import de.hybris.platform.servicelayer.model.ModelService;
import nl.hybris.acorelcx.core.model.EUWeatherModel;

import javax.annotation.Resource;


public class EUWeatherAction implements CockpitAction<EUWeatherModel, String>
{
	@Resource
	private CronJobService cronJobService;

	@Resource
	private ModelService modelService;
	@Resource(name = "notificationService")
	private NotificationService notificationService;

	private static final String CONFIRMATION_MESSAGE = "hmc.action.euweather.confirmation.message";
	private static final String CONFIRM_EUWEATHER_EVENT = "acorelcxbackoffice.euweather.event";

	@Override
	public ActionResult<String> perform(ActionContext<EUWeatherModel> actionContext) {

		CronJobModel cronJobModel = cronJobService.getCronJob("euWeatherReaderCronJob");
		cronJobService.performCronJob(cronJobModel,true);

		notificationService.notifyUser(notificationService.getWidgetNotificationSource(actionContext), CONFIRM_EUWEATHER_EVENT,
				NotificationEvent.Level.SUCCESS);

		return new ActionResult<>(ActionResult.SUCCESS);
	}

	@Override
	public boolean canPerform(ActionContext<EUWeatherModel> ctx) {
		return CockpitAction.super.canPerform(ctx);
	}

	@Override
	public boolean needsConfirmation(ActionContext<EUWeatherModel> ctx) {
		return CockpitAction.super.needsConfirmation(ctx);
	}

	@Override
	public String getConfirmationMessage(ActionContext<EUWeatherModel> ctx) {
		return ctx.getLabel(CONFIRMATION_MESSAGE);
	}

}
