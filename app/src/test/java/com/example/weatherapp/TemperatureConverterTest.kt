package com.example.weatherapp

import org.junit.Test

class TemperatureConverterTest {
    @Test
    fun `GIVEN a temperature in Celsius WHEN I change the scale to Fahrenheit THEN the temperature is converted correctly`() {
        val result = TemperatureConverter.celsiusToFahrenheit(10.0)
        assert(result == 50.0)
    }

    @Test
    fun `GIVEN a temperature in Fahrenheit WHEN I change the scale to Celsius THEN the temperature is converted correctly`() {
        val result = TemperatureConverter.fahrenheitToCelsius(50.0)
        assert(result == 10.0)
    }
}