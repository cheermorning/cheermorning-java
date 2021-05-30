package com.cheermorning.mode.created.simplefactory.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 胡椒披萨
 * @date 2021-4-14
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨 准备原材料~~~~~~");
    }
}
