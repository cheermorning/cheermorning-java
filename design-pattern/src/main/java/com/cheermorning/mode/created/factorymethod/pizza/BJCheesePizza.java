package com.cheermorning.mode.created.factorymethod.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 奶酪披萨
 * @date 2021-4-14
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName(" 北京奶酪披萨 ");
        System.out.println("北京奶酪披萨 准备原材料......");
    }
}
