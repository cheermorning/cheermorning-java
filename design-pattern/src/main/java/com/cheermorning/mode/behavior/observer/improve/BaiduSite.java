package com.cheermorning.mode.behavior.observer.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class BaiduSite implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    //更新
    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    //展示
    public void display(){
        System.out.println("++百度网站++");
        System.out.println("今天 气温：" + this.temperature);
        System.out.println("今天 气压：" + this.pressure);
        System.out.println("今天 湿度：" + this.humidity);
    }
}
