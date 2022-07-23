package com.example.weatherapp.adapters

data class WeatherModel(
    val time: String,
    val imageUrl: String,
    val city: String,
    val currentTempC: String,
    val currentTempF: String,
    val condition: String,
    val speedWindKm: String,
    val speedWindMl: String,
    val minTempC: String,
    val minTempF: String,
    val maxTempC: String,
    val maxTempF: String,
    val hours: String
)
