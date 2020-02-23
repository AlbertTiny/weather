package com.albert.weather.service;

import com.albert.weather.entity.WeatherResponse;

public interface WeatherService {
    WeatherResponse getWeatherByCity(String city);

    WeatherResponse getWeatherByCitykey(String cityKey);
}
