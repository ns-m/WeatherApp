package com.example.weatherapp.dataclasses

data class DayItem(
    val nameCity: String,
    val localTime: String,
    val conditionText: String,
    val conditionIcon: String,
    val currentTemprC: String,
    val currentTemprF: String,
    val forecastMaxTemprC: String,
    val forecastMaxTemprF: String,
    val forecastMinTemprC: String,
    val forecastMinTemprF: String,
    val forecastAvgTemprC: String,
    val forecastAvgTemprF: String,
    val forecastWindSpKm: String,
    val currentWindSpMl: String,
    val hours: String
)
