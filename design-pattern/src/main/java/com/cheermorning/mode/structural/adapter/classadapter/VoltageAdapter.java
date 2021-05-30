package com.cheermorning.mode.structural.adapter.classadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 适配器
 * @date 2021-4-26
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {


    @Override
    public int output5V() {
        int source = output220V();
        System.out.println("将市电压220V降为手机充电标准电压5V");
        return source / 44;
    }
}
