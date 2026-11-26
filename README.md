# Weatherapp-kotlin

A Android weather forecast screen built with Kotlin and XML layouts.
 
## Features
 
- Current weather: city, temperature, condition and time of the last update
- Hourly forecast with four time slots
- Switch between Celsius (°C) and Fahrenheit (°F)
- Light and dark mode support
- Accessibility: TalkBack descriptions, headings, scalable text and 48dp touch targets
## Tech
 
- Kotlin, object-oriented model (`WeatherReport` → `HourlyWeatherReport`)
- XML layouts with Material 3 components
- JUnit unit tests for the temperature conversion
- Min SDK 28 (Android 8.0)
## Getting started
 
### Requirements
 
- [Android Studio](https://developer.android.com/studio) (latest stable version)
- An Android emulator or a physical device running Android 8.0 or newer
### Run the app
 
1. Clone the repository:
```bash
git clone https://github.com/jose-garzon/weather-app.git
```
2. Open the project folder in Android Studio and wait for the Gradle sync to finish.
3. Select an emulator or a connected device.
4. Click **Run ▶** (or press `Shift + F10`).
### Run the tests
 
In Android Studio, right-click `TemperatureConverterTest` and choose **Run**, or use the terminal:
 
```bash
./gradlew test        # macOS / Linux
gradlew test          # Windows
```
 
## Project structure
 
```
app/src/main/java/com/example/weatherapp
├── WeatherReport.kt          # Base class
├── HourlyWeatherReport.kt    # Subclass class
├── TemperatureConverter.kt   # Celsius ↔ Fahrenheit conversion
└── MainActivity.kt           # Connects the model to the UI
app/src/main/res/layout/
├── activity_main.xml         # Main screen
└── hourly_report.xml         # Reusable hourly forecast item
app/src/test/java/com/example/weatherapp
└── TemperatureConverterTest.kt
```

