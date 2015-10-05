This page contains some notes designed to help you migrate to the SDK from the old Java sample code.  The key difference between the old sample code project and the SDK is that in the SDK you no longer have to edit the Servlet sourcecode in order to plug in new notification handler classes.

Therefore, you should:

1. Remove all references to the old Java sample libraries.  Making sure to keep your custom notification processor classes safe (they inherit from `AbstractNotificationProcessor`).

2. Switch over to use the new Servlet.  We created a new Servlet which implements a new notification dispatch mechanism.  This means that the following Servlets are no longer used (`NotificationServlet`, `MerchantCalculationServlet`, `JmsNotificationServlet`) and you will need to change all references to these over to the new `CheckoutNotificationServlet`.  There is a sample [web.xml](http://google-checkout-java-sdk.googlecode.com/svn/trunk/sdk/web/WEB-INF/web.xml) in the SDK.

3. Setup the XML configuration file which contains merchant constants and mappings from message types to notification handler classes.  This means you should no longer be using the properties file for setting merchant constants.  Take a look at the [checkout-config.xml](http://google-checkout-java-sdk.googlecode.com/svn/trunk/sdk/web/WEB-INF/checkout-config.xml) file for an example.

4. Migrate your notification processor classes from step 1 over to use the [MessageHandler](http://google-checkout-java-sdk.googlecode.com/svn/trunk/sdk/docs/javadoc/com/google/checkout/handlers/MessageHandler.html) interface.  All notification handlers are required to implement this interface in order to be legally registered in the checkout-config.xml.  This interface replaces the old `AbstractNotificationHandler`.  Note that the process method now takes a String rather than the strongly typed callback wrapper classes, this makes it easier to extend the dispatch mechanism later if required.  You can still use the wrappers classes, but you will need to instantiate them in your handler implementations - see the handlers package for examples of how to do this.

5. In addition to the architectural changes, some class names changed.  The intent of the class remains the same - e.g. `MerchantConstants` is now [MerchantInfo](http://google-checkout-java-sdk.googlecode.com/svn/trunk/sdk/docs/javadoc/com/google/checkout/MerchantInfo.html).  Your IDE should be able to help you resolve these issues.

6. Update your merchant center integration settings to point to the new callback URLs as defined in the new web.xml deployment descriptor.

7. Deploy and test!