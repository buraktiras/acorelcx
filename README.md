**The development, which consumes the openweathermap.org api's and brings the weather information of 4 cities(can increase) in the Netherlands to the backoffice cockpit (EU Weather) screen**

**Data can be manually updated from the Cronjob screen in the Backoffice tree with the "EUWeatherCronJob" trigger, or from the "EU Weather" screen under the Marketing subheading. If no manual action is taken, the cronjob will automatically update every hour.**

Setup
-----

* [Download](https://help.sap.com/docs/SAP_COMMERCE/a74589c3a81a4a95bf51d87258c0ab15/9f99b61bd8f14414a60340ee5d77a51f.html?locale=en-US)
  the Hybris 2205 source zip file from SAP Market Place.


```bash

localextensions.xml

<extension name='acorelcxcore' />
<extension name='acorelcxbackoffice' />
<extension name='acorelcxfacades' />
<extension name='acorelcxfulfilmentprocess' />
<extension name='acorelcxinitialdata' />
<extension name='acorelcxtest' />
<extension name='acorelcxstorefront' />


```

------

```bash
IMPEX

INSERT_UPDATE ServicelayerJob;code[unique=true];springId[unique=true]
;euWeatherReaderServiceJob; euWeatherListJob

INSERT_UPDATE EUWeatherListJob; code[unique=true];job(code);sessionLanguage(isocode);hours
;euWeatherReaderCronJob; euWeatherReaderServiceJob;en;1

INSERT_UPDATE Trigger;cronJob(code)[unique=true];cronExpression
;euWeatherReaderCronJob; "0 0 * ? * *"


```
