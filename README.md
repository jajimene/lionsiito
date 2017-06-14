# lionsiito
Lion SII WS SSL testing

See: http://www.agenciatributaria.es/AEAT.internet/SII.html

### VM arguments
```
-Djavax.net.ssl.trustStoreType=jks 
-Djavax.net.debug=ssl
-Djavax.net.ssl.keyStorePassword=changeit
-Djavax.net.ssl.trustStorePassword=changeit
```


### Useful links

* https://alesaudate.wordpress.com/2010/08/09/how-to-dynamically-select-a-certificate-alias-when-invoking-web-services/
* https://stackoverflow.com/questions/11001102/how-to-programmatically-set-the-sslcontext-of-a-jax-ws-client
