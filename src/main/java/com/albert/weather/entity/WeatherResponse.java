package com.albert.weather.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 17:36
 */
@Data
public class WeatherResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private WeatherVO data;
    private Integer status;
    private String desc;
}
