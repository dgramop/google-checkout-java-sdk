# Introduction #

In an effort to make Checkout integration as easy as possible, we are now creating a NetBeans module that will allow you to integrate Checkout SDK through a simple wizard and manage your Checkout handlers through a simple UI.  This project is available as a distributable NetBeans Module and works with NetBeans 5.5.1 and greater.

# Installing the Module #

  1. Get the most recent .nbm file from the [downloads](http://code.google.com/p/google-checkout-java-sdk/downloads/list) section.
  1. Open NetBeans and go to the Update Center (Tools -> Update Center).
  1. Select "Install Manually Downloaded Modules (.nbm File)" and click Next.
  1. Press "Add...", select the .nbm file you downloaded earlier, click Okay and then click Next.
  1. You should see "Google Checkout SDK Integration" in the "Include in Install" area.  You can also read some information about the module at the bottom of the screen.  Click Next to continue.
  1. Read and accept the license.
  1. The module should install quickly.  Click Next to continue.
  1. At this time, we do not have a signed certificate for this module.  Check the Include box next to "Google Checkout SDK Integration" and click Yes when the warning pops up.
  1. Click Finish to finish the installation.

# Using the Module #

Using this module can be divided into two clear steps: initial integration and assigning handlers.

## Initial Integration (Integration Wizard) ##

Before you can begin integration, you must first load your web application into NetBeans.  You could do this by creating a new Web Application and starting from scratch, or by creating a Web Application with Existing Sources and importing your existing web application.  From here out, we will assume that you have this project created correctly.

To begin, go to Tools -> Checkout SDK | Integration Wizard.  This will launch the Integration Wizard, which will guide you through the steps to integrate Checkout SDK.

### 1. Select Project ###

Select the project that you wish to integrate with Checkout SDK from the list of open projects.  Then locate your WEB-INF directory using the text field and Browse button in the bottom of the Wizard (in a normal web application, the WEB-INF folder should be automatically located).  Once the folder is selected, click Next to continue.

### 2. Modify web.xml ###

In order to handle incoming messages from the Checkout servers, your web application needs some additional information added to its web.xml file.  This wizard will locate your web.xml file and attempt to add the appropriate XML fragment.  In the preview area you can see the new contents of web.xml and modify them if you like.  At the end of the wizard, whatever is in this text box will be written to your web.xml file.

If the web.xml file can't be found, you may skip this step and add the fragment manually after the wizard has run.  You can find the appropriate fragment in checkout-sdk.zip (available on the [downloads](http://code.google.com/p/google-checkout-java-sdk/downloads/list) page) at web/WEB-INF/web.xml.

Click Next to continue.

### 3. Create Config File ###

In order to keep track of your individual merchant information and the names of your handlers, Checkout SDK needs to create a config file in your web application.  This file, checkout-config.xml, will be placed alongside your web.xml file in your WEB-INF directory.  This step requires you to supply your merchant ID and key, as well as the desired environment (Sandbox or Production) and currency code.  Enter this information and click Next to continue.

### 4. Add Samples Pages ###

Supplied in Checkout SDK are some sample JSPs which can show you examples of handlers in action as well as help you test your web implementation.  These pages allow you to generate a sample cart and send messages to the Checkout servers, among other things.

If you would like these samples added to your web application, make sure the checkbox is selected and enter a location for these pages.  The default location is web/checkout.  Click Next to continue.

### 5. Confirm Changes ###

The final step of this wizard is a confirmation dialog, which shows the affected project and lists all of the changes this wizard will make.  Clicking Finish will execute all of these changes.  If you don't wish to do something on the list, you may go back to previous pages and change your selections.

If the checkbox at the bottom of the page is selected when the wizard finishes, the Handler Manager (covered below) will be run directly after this wizard.

## Assigning Handlers (Handler Manager) ##

The Handler Manager is a tool with allows you to manage Checkout handlers in a web application.  When launched, it will show all open projects with checkout-config.xml files on the left side of the screen.  Selecting a project will populate the tables to the right with information about handlers, including the type of message handled (i.e. new-order-notification) and the name of the handler class (i.e. com.google.checkout.sdk.NewOrderNotificationHandler).  You can modify the handler names manually, and checkout-config.xml will be updated when the Save button is pressed.

This manager also allows you to create new java handler classes.  To do so, click on the "Create New Handler" button in the bottom left of the screen.  This will bring up another dialog which asks for the name, location and package name of the new class.  You can also select the message class (notification or callback), message type and implementation.  Currently only empty implementations are supported, but others may be included in future releases.  If selected, the last option (Update Handler Manager) will automatically update the tables in the Handler Manager with the new class name.

## Assigning Application Server ##

In the build.properties file (located in the main directory along with build.xml), modify the tomcat.home value to point to your installation of tomcat or change the servlet-api-jar.path to point to a suitable path if you want to use a different application server.

# Troubleshooting #

### Why does NetBeans tell me that the package com.google.checkout does not exist? ###

This module doesn't automatically add the newly created checkout-sdk.jar to your project's path (yet).  The simplest solution is to close the project and reopen it, letting NetBeans automatically handle adding the jar.  You could also add the jar manually by right clicking on Libraries, selecting "Add JAR/Folder" and locating checkout-sdk.jar (in your WEB-INF/lib directory).

### Note: Building the module manually ###

To build this module manually, you must first copy checkout-sdk-0.7.zip to your nbmodule directory and run the ant target "setup."  This needs to be done each time the project is made "clean."  After this, you may build and run just like any other NetBeans project.

### Other Problems ###

This module is still in early development.  We hope that you will try it out and that it will save you time during your Checkout integration, but if you find problems please report them through the [issues](http://code.google.com/p/google-checkout-java-sdk/issues/list) page.  The source code is also available from the [source](http://code.google.com/p/google-checkout-java-sdk/source) page, so if you understand a problem and can fix it, you're welcome update the code and submit a patch.  This is a community supported project, so your contributions are greatly appreciated!