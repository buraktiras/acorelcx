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