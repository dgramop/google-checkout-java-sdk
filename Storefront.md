# Introduction #

The sample store project is intended to be a prototype for the user-front end of Google's Storefront project. In a nutshell, Google's Storefront project is intended to bring together all of Google's technologies for the purpose of an online store with Google Checkout being the core technology.

# A. Merchant Section #

## 1. How to Use ##
To use the storefront project, a merchant is expected to download the .war of the storefront and upload it to his or her hosted web server. The merchant will then configure the .xml file associated with the store by setting the logo of the store, the theme he or she would like to use, the URL location to grab the feed and the name of the store.

This store will then be available to the public and users will then be able to browse the merchant's "personal" website. Since the source code will be made available, the merchant will be able to modify the sample store to any degree he or she chooses.

## 2. Uploading to Base ##
The merchant will need to upload his or her items to Google Base. After uploading an item, the merchant will need to specify the attributes to indicate the sub-categories an item will appear under. For example, when creating an item for an electronic product "Nintendo Wii", specify "Electronics" for item-type. The item-type tag determines the top-level category of a product. The sub-category attributes, which take the form sub-category-#, determine what sub-categories   the item will appear under. For example, specifying "Video Game Consoles" as the value for the attribute "sub-category-1" and "Nintendo" as the value for the attribute "sub-category-2", the Nintendo Wii item will appear in the GridStore under the path Electronics -> Video Game Consoles -> Nintendo.

# B. Developer's Section #

## 1. GridStore sample ##
The GridStore is a sample store written with GWT to display the items (that a merchant can upload to Base), in a grid format similar to the way Product Search (see www.google.com/products) displays its items, using the widgets GWT has made available. The GridStore currently supports arbitrary levels of nesting.

### i. Customization ###
You can change the color scheme of the sample store by following these steps.

Navigate to the "src/com/google/checkout/samples/samplestore" dir.
Open up the ${store.name}.gwt.xml corresponding to the store you want to build in
your favorite text editor. Edit the line with the stylesheet tag:
> e.g. 

&lt;stylesheet src="style/!GridStore-default.css"/&gt;



You can change the 'src' attribute to point to any of the styles found under
"src/com/google/checkout/samples/samplestore/public/style". Simply have the 'src'
attribute point to 'style/GridStore-

&lt;theme&gt;

.css'.