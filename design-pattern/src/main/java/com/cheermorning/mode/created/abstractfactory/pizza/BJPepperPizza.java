package com.cheermorning.mode.created.abstractfactory.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 胡椒披萨
 * @date 2021-4-14
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨 准备原材料~~~~~~");
    }
}
