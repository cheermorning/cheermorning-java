package com.cheermorning.mode.created.factorymethod.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 希腊披萨
 * @date 2021-4-14
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京希腊披萨");

        System.out.println("北京希腊披萨 准备原材料//////");
    }
}
