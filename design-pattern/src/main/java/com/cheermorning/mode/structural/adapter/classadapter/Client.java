package com.cheermorning.mode.structural.adapter.classadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-26
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("类适配器：为手机充电");
        Phone phone = new Phone();

        phone.charging(new VoltageAdapter());
    }
}
