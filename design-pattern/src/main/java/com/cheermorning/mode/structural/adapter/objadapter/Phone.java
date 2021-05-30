package com.cheermorning.mode.structural.adapter.objadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-26
 */
public class Phone {

    public void charging(IVoltage5V i5v){
        if(i5v.output5V() == 5) {
            System.out.println("符合手机充电电压标准5V，可充电！");
        }else{
            System.out.println("不符合手机充电电压标准5V，不可充电！");
        }
    }
}
