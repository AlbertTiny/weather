package com.albert.weather.service.Impl;

import com.albert.weather.entity.WeatherResponse;
import com.albert.weather.service.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 12:18
 */
@Service
public class WeatherServiceImpl implements WeatherService {
    static String baseURL = "http://wthrcdn.etouch.cn/weather_mini?";
    @Autowired
    RestTemplate restTemplate;

    @Override
    public WeatherResponse getWeatherByCity(String city) {

        //1.发送http请求
        String url = baseURL + "city=" + city;
        WeatherResponse result = getResult(url);

        return result;
    }

    @Override
    public WeatherResponse getWeatherByCitykey(String cityKey) {

        //1.发送http请求
        String url = baseURL + "citykey=" + cityKey;
        WeatherResponse result = getResult(url);
        return result;
    }

    private WeatherResponse getResult(String url) {
        WeatherResponse resp = null;
        ObjectMapper mapper = new ObjectMapper();
        ResponseEntity<String> res = restTemplate.getForEntity(url, String.class);
        if (res.getStatusCodeValue() == 200) {
            String body = res.getBody();
//            JSONObject jsonObject = JSON.parseObject(body);
//            String result = JSON.toJSONString(jsonObject.getJSONObject("data"));
//            vo= JSON.parseObject(result,WeatherVO.class);
            //2.将请求转为vo对象
            try {
                resp = mapper.readValue(body, WeatherResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //TODO 抛出异常
        }
        return resp;
    }
}
