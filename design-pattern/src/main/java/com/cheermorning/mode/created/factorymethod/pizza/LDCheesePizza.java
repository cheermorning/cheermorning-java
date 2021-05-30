package com.cheermorning.mode.created.factorymethod.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 奶酪披萨
 * @date 2021-4-14
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {

        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨 准备原材料......");
    }
}
