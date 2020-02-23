package com.albert.weather.service;

import com.albert.weather.entity.WeatherResponse;
import com.albert.weather.service.Impl.WeatherServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 12:20
 */
@SpringBootTest
public class WeatherServiceTest {
    @Autowired
    WeatherServiceImpl WeatherService;

    @Test
    public void getWeatherByCityTest() {
        String city = "深圳";
        WeatherResponse vo = WeatherService.getWeatherByCity(city);
        System.out.println(vo.toString());
    }
}
