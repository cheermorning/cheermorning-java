package com.cheermorning.mode.behavior.observer;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class Client {
    public static void main(String[] args) {

        //天气数据

        //网站
        CurrentConditions currentConditions = new CurrentConditions();

        //天气数据
        WeatherData weatherData = new WeatherData(currentConditions);

        weatherData.setData(20f,100f, 50f);
    }
}
