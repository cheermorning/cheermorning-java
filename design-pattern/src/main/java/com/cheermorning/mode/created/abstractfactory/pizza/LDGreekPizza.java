package com.cheermorning.mode.created.abstractfactory.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 希腊披萨
 * @date 2021-4-14
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦希腊披萨");
        System.out.println("伦敦希腊披萨 准备原材料//////");
    }
}
