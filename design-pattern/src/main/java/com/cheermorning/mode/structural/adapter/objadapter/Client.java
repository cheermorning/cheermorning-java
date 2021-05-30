package com.cheermorning.mode.structural.adapter.objadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 对象适配器
 * @date 2021-4-26
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器：为手机充电");
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        phone.charging(new VoltageAdapter(voltage220V));
    }
}
