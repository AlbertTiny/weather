package com.albert.weather.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 12:08
 */
@Data
public class DayDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 日期
     */
    String date;
    /**
     * 最高温度
     */
    String high;
    /**
     * 风向
     */
    String fx;
    /**
     * 最低温度
     */
    String low;
    /**
     * 风级
     */
    String fl;
    /**
     * 天气类型 e.g 晴
     */
    String type;
}
