package com.cheermorning.mode.created.simplefactory;

import com.cheermorning.mode.created.simplefactory.improve.PizzaOrder3;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 披萨店
 * @date 2021-4-14
 */
public class PizzaStore {

    public static void main(String[] args) {
        /*普通方式*/
//        new PizzaOrder();
        /*简单工厂方式*/
//        new PizzaOrder2(new SimpleFactory());
        /*简单工厂，静态工厂模式*/
        new PizzaOrder3();
        System.out.println("订购结束。。。");
    }
}
