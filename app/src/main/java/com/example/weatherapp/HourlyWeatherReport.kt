package com.example.weatherapp

import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter


class HourlyWeatherReport(
    city:String,
    temperatureInCelsius: Double,
    weatherCondition: WeatherCondition,
    updatedAt: LocalDateTime,
    val hour: LocalTime,
):WeatherReport(city, temperatureInCelsius, weatherCondition, updatedAt)  {
    fun formatHour():String {
        return hour.format(DateTimeFormatter.ofPattern("HH:mm"))
    }
    override fun formatReport(scale: TemperatureScale): String {
        return "$${formatHour()} | ${super.formatReport(scale)}"
    }
}