# Introduction #

The Netbeans and Eclipse plugins projects have been refactored in order to eliminate code duplication. In doing so, building each project currently requires several steps. Eventually, steps should be taken to modify build scripts in order to eliminate all intermediate build steps for each plugin project.

# Building the Netbeans and Eclipse plugins projects #

Once you have checked out the code onto your local machine you will need to build the following projects in the following order:

### 1. SDK ###

To build the Google Checkout SDK, navigate to the sdk directory and build the project with the following command: **ant -f dist.xml**.  This command will build the necessary zip file used by the module project, which the Netbeans and Eclipse projects depend on.

### 2. Module ###

The module project contains all common code used by both the Netbeans and Eclipse projects. To build the module project, navigate to the module directory and build the project with the **ant setup** command. Doing so will copy the zip file of the SDK created in step 1, listed above. Next, in order to build the module.jar that both the Netbeans and Eclipse projects will depend on, invoke the **ant build-jar** command from the module directory.

### 3. Running the Netbeans/Eclipse Plugins ###

For the Netbeans plugin project, navigate to the 'nbmodule' folder and invoke the 'ant setup' command. For the Eclipse plugin project, navigate to the 'checkout-eclipse' folder and invoke the **ant setup** command. Open each project in its respective IDE (i.e. the Netbeans project with the Netbeans IDE and/or the Eclipse project with the Eclipse IDE).

To run the Netbeans plugin, set the 'checkout-netbeans' project as the Main project and go to Run->Run Main Project.

To run the Eclipse plugin, left click on the 'checkout-eclipse' project and go to Run->Run

### 4. Building the Netbeans/Eclipse Plugins ###

For the Netbeans plugin project, in the Netbeans IDE, go to the Projects tab in the Navigation pane. Right click on the desired project and select 'Create NBM(s)'.

For the Eclipse plugin project, invoke the **ant zip.plugin** command from the 'checkout-eclipse' directory.