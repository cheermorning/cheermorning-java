package com.cheermorning.mode.created.simplefactory.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 希腊披萨
 * @date 2021-4-14
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨 准备原材料//////");
    }
}
