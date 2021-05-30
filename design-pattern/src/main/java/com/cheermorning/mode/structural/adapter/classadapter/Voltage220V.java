package com.cheermorning.mode.structural.adapter.classadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 被适配者
 * @date 2021-4-26
 */
public abstract class Voltage220V {

    public int output220V(){
        int source = 220;
        System.out.println("市电压(source)为：" + source + "伏");
        return source;
    }
}
