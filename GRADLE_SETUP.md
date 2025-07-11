# Gradle Setup Instructions

## To complete the Maven to Gradle conversion:

### 1. Download gradle-wrapper.jar
Download the gradle-wrapper.jar file from:
```
https://github.com/gradle/gradle/raw/v8.6.0/gradle/wrapper/gradle-wrapper.jar
```

Save it to: `gradle/wrapper/gradle-wrapper.jar`

### 2. Make gradlew executable (Unix/Linux)
```bash
chmod +x gradlew
```

### 3. Test the build
```bash
./gradlew build
```

## Files Created:
- `build.gradle` - Main Gradle build file
- `settings.gradle` - Project settings
- `gradle.properties` - Gradle properties
- `gradlew` - Unix/Linux wrapper script
- `gradlew.bat` - Windows wrapper script
- `gradle/wrapper/gradle-wrapper.properties` - Wrapper configuration

## Files to Remove (after confirming Gradle works):
- `pom.xml`
- `mvnw`
- `mvnw.cmd`
- `.mvn/` directory 