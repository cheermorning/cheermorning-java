package com.cheermorning.mode.structural.adapter.objadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 适配器
 * @date 2021-4-26
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int target = 0;
        if (null != voltage220V) {
            int source = voltage220V.output220V();
            System.out.println("将市电压220V降为手机充电标准电压5V");
            target = source / 44;
        }
        return target;
    }
}
