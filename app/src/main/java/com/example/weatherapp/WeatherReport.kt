package com.example.weatherapp

import java.time.LocalDateTime

open class WeatherReport(
    val city:String,
    val temperatureInCelsius: Double,
    val weatherCondition: WeatherCondition,
    val updatedAt: LocalDateTime
) {
    fun temperatureIn(scale: TemperatureScale):Double {
        return when (scale) {
            TemperatureScale.CELSIUS -> temperatureInCelsius
            TemperatureScale.FAHRENHEIT -> TemperatureConverter.celsiusToFahrenheit(temperatureInCelsius)
        }
    }
    fun formatTemperature(scale: TemperatureScale):String {
        return "${temperatureIn(scale)}${scale.symbol}"
    }
    fun formatWeatherCondition():String {
        return weatherCondition.description
    }
    open fun formatReport(scale: TemperatureScale):String {
        return "${city}: ${formatTemperature(scale)} ${formatWeatherCondition()}"
    }
}