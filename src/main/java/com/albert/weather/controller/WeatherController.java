package com.albert.weather.controller;

import com.albert.weather.entity.WeatherResponse;
import com.albert.weather.service.Impl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 16:23
 */
@RestController
@ComponentScan
public class WeatherController {
    @Autowired
    WeatherServiceImpl weatherService;

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getByCity(@PathVariable("cityName") String cityName) {
        return weatherService.getWeatherByCity(cityName);
    }

    @GetMapping("/cityKey/{cityKey}")
    public WeatherResponse getBycityKey(@PathVariable("cityKey") String cityKey) {
        return weatherService.getWeatherByCitykey(cityKey);
    }
}
