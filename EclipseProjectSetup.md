# Obtaining Apache Maven #

On Ubuntu or Debian, you can install the **maven2** package by typing `aptitude install maven2` at the command line.

# Adding Subversion Support in Eclipse #

First download and install [Eclipse](http://eclipse.org/). Then start eclipse, and create a new workspace. Then follow the [Subclipse installation instructions](http://subclipse.tigris.org/servlets/ProjectProcess?pageID=p4wYuA) to install Subclipse.

# Use eclipse to make changes to the SDK #
  1. checkout sdk code to a directory
  1. goto the sdk subdirectory
  1. run `mvn eclipse:eclipse`
  1. import the project into eclipse

Using a plugin to integrate Maven and SCM support into Eclipse can make the experience quite a bit better. If you have [Maven support in Eclipse](http://maven.apache.org/eclipse-plugin.html) and [Subclipse](http://subclipse.tigris.org/) installed, you can just checkout the project within Eclipse like so.
  1. Select File -> New -> Project... menu option.
  1. Select Maven -> Checkout Maven Projects from SCM from the project wizard list.
  1. For SCM URL, enter "svn" in the drop down and "http://google-checkout-java-sdk.googlecode.com/svn/trunk/" in the textbox and click "Finish". Keep in mind that you will need to use the https URL from [here](http://code.google.com/p/google-checkout-java-sdk/source/checkout) if you want be able to commit changes from your working copy.
  1. The code will be checked out into a subdirectory of your workspace directory called maven.${number} where ${number} is just some number. The project will be loaded into Eclipse and you'll be ready to go.

Of the Eclipse plugins, I have found that [M2Eclipse](http://eclipse.org/m2e/) works better with this project than Eclipse IAM (formerly Q4E) right now. Eclipse IAM doesn't seem to understand the resource directories that hold the non-java resource files.

# Generate javadoc API documentation on Command Line #
  1. checkout code to a directory
  1. change to the sdk subdirectory
  1. run `mvn javadoc:javadoc` (only javadoc) or `mvn site` (all package information)
  1. look in the target/site/apidocs directory for the generated docs

# Creating Checkout SDK .jar File #
  1. go into the sdk project directory
  1. type `mvn package`
  1. look for the jar in the target subdirectory

# Old instructions for 0.8.8 and before #
  1. Start Eclipse, and select "SVN repository Exploring" perspective in Window | Open Perspective | Other
  1. Right click in the "SVN Repository" tab, and select New | Repository Location
  1. For Url, use https://google-checkout-java-sdk.googlecode.com/svn/trunk/, and press "Finish"
  1. Use your gmail user-name, and googlecode.com password. Note that the googlecode.com password is different from your gmail password and is auto-generated. You can view your googlecode.com password at: http://code.google.com/p/google-checkout-java-sdk/source
  1. Navigate down in the tree rooted at https://google-checkout-java-sdk.googlecode.com/svn/trunk/. Right click on sdk, and select "Checkout...". Accept default values.
  1. Download the Java 2 Standard Edition Runtime Environment (JRE) or the full JDK, release version 5.0 or later, from http://java.sun.com/j2se if you don't have it already.
  1. Set your JAVA\_HOME variable to the JDK base directory (ex: C:\Sun\SDK\jdk) or the JRE\_HOME variable to the JRE base directory (ex: C:\Sun\SDK\jdk\jre)
  1. Download and install Tomcat 6.0 at http://tomcat.apache.org/ if you don't have it already.
  1. Switch to "Java EE" or "Java" perspectives to start development on this project.
  1. Right-click on the root node, google-checkout-java-sdk, and select properties.
  1. Select "Targeted Runtimes" and create a new runtime for Apache | Apache Tomcat 6.0.
  1. (Only in the Java EE perspective) Select "Servers" tab below the main editor window.  Right-Click in the window and select New | Server.  Choose Apache | Tomcat 6.0 Server, click Next.  Then click "Add All >>" to configure the project on the server.
  1. Clean and Rebuild the project by going to Project | Clean... and then selecting "Clean projects selected below" and ensuring that google-checkout-java-sdk is checked and then click Ok.  This should get rid of the errors we have seen before.
  1. Congratulations, you now have the Checkout SDK project setup with Eclipse.
  1. To run the SDK, right click on the google-checkout-java-sdk node, select "Run As" | "Run On Server"

## Other Notes ##
  1. If you still encounter errors, right-click on the google-checkout-java-sdk node and select "Properties...". Select Java Build Path on the left, and then select the tab Libraries, and ensure that Apache Tomcat v6.0 is one of the libraries.  This includes necessary jars at "

<APACHE\_HOME\_DIR>

/lib" like the servlet-api.jar.  If its not there, then you can select "Add Library..." from the same menu.  Then select "Server Runtime" and then Apache Tomcat v6.0