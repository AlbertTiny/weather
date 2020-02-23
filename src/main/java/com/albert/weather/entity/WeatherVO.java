package com.albert.weather.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 12:04
 */
@Data
@ToString
public class WeatherVO implements Serializable {
    private static final long serialVersionUID = 1L;
    DayDetail yesterday;
    String city;
    List<PredictDetail> forecast;
    String ganmao;
    String wendu;
}
