### Notes for packaging javafx applications (JDK 18, JFX 18, Gradle 7.4.2)

1. Download latest open jdk -> http://jdk.java.net/18/, download zip, extract

2. Set JAVA_HOME env variable to extracted path

3. Check version
   $ java -version
   openjdk version "18.0.1.1" 2022-04-22
   OpenJDK Runtime Environment (build 18.0.1.1+2-6)
   OpenJDK 64-Bit Server VM (build 18.0.1.1+2-6, mixed mode, sharing)

4. Download and install latest version of Wix -> https://wixtoolset.org/releases/

5. Add wix install folder to PATH env variable, e.g. "C:\Program Files (x86)\WiX Toolset v3.11\bin"

6. Create new JavaFX project with IntelliJ, pick right JDK and gradle for build system.

7. Use "./gradlew run" to run dev version

8. Use "./gradlew jpackage" to create .exe/.msi setup files in build/jpackage/