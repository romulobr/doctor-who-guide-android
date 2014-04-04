doctor-who-guide-android
========================

To compile the project, you need to install android jars on your local mvn repository, I use use this little thing to help me do that in an easy fashion:

https://github.com/mosabua/maven-android-sdk-deployer

To run the unit tests:
mvn clean install test -Dandroid.sdk.path=$ANDROID_HOME

Doctor who guide is an android-app to help me learn android development with TDD and some other good practices.

I love doctor who, and I love coding, so why not put these things together.