package com.albert.weather.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Albert Tiny
 * @time: 2020/2/23 12:13
 */
@Data
public class PredictDetail implements Serializable {
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
     * 风力 e.g <![CDATA[<3级]]>
     */
    String fengli;
    /**
     * 最低温度
     */
    String low;
    /**
     * 风向
     */
    String fengxiang;
    /**
     * 天气类型 e.g 晴
     */
    String type;
}
