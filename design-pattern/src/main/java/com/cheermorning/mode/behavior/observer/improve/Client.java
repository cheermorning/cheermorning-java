package com.cheermorning.mode.behavior.observer.improve;

import java.util.ArrayList;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class Client {
    public static void main(String[] args) {

        //集合
        ArrayList<Observer> observerList = new ArrayList<>();
        //网站
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        observerList.add(currentConditions);
        observerList.add(baiduSite);
        //天气数据
        WeatherData weatherData = new WeatherData(observerList);

        weatherData.setData(20f,100f, 50f);
    }
}
