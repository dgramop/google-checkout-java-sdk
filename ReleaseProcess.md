# Introduction #

In order to make the release process of the Google Checkout API SDK as straightforward as possible, the following steps have been provided:

# Before the Check-in #
  1. Run the JUnit tests in order to ensure that there are no regression errors.
  1. Update the release notes.
  1. Update the version number accordingly for the SDK bundle. As a convention , we use dot.dot version for a bug-fix release, and dot version for a feature update.
  1. Build the release.
    1. First, run ant clean in the sdk/ and the samples/ directories.
    1. Second, run ant-f dist.xml in the sdk/ directory.
  1. Unzip the download bundle and do some quick sanity testing.  For example, you may want to ensure that the index.html has meaningful content, the javadoc and release notes are present, and that the project/ and samples/simple directories build correctly.  Additionally, both of the project/ and samples/simple directories should load up correctly in Netbeans.

# The Check-in #
  1. Check-in all appropriate files with appropriate log messages.
  1. Create a subversion tag for the release with the message 'Tagging the X.X release of the Google Checkout API SDK project.'

# After the Check-in #
  1. Upload the project zip file with the correct title and use the labels featured, archive type, and all platforms for the uploaded file.
  1. Mark the previous version of the SDK as deprecated.
  1. Post a release announcement on the forum. (http://groups.google.com/group/google-checkout-api-java/topics)
  1. Create a blog post for Checkout. (http://googlecheckoutapi.blogspot.com/)