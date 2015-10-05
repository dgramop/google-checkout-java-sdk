# What are the licensing terms for the Checkout SDK? #
The source-code for the Checkout SDK project is available under an open-source license [Apache License 2.0](http://www.apache.org/licenses/).

# What are the support options for the Checkout SDK? #
[Google checkout developer forum](http://groups.google.com/group/google-checkout-developers-forum) is the best place to ask questions related to the Checkout SDK.
The checkout SDK is a **community-supported** project. We intend to occasionally release minor updates. If you need a bug-fix urgently and can not wait for the update release, you have two options:
  1. Modify the source-code available under the project/ directory of your SDK bundle and build a new library for your use.
  1. Download the source-code from the subversion repository and build a release yourself. [Here](http://code.google.com/p/google-checkout-java-sdk/wiki/EclipseProjectSetup) are the instructions on how to download and build the project from Eclipse.
You are welcome to log any bugs or suggested bug-fixes under the [Issues](http://code.google.com/p/google-checkout-java-sdk/issues/list) page.

# What versions of the JDK are supported? #
The checkout SDK should work with any JDK that conforms to version 1.5 or later.

# What security mechanism does the Checkout SDK use while posting the cart to Google Checkout? #
The checkout SDK simply does a server to server post.  It is plain XML over https, secured with basic authentication.  See the send() method on AbstractCheckoutRequest for details of this.

# Does the SDK support Google App Engine? #
Not yet. The next major version should include the needed changes. However, it will require API changes. Your best bet is to track to Subversion repository for details on those changes.