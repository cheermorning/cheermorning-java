package com.cheermorning.mode.created.abstractfactory.order;

import com.cheermorning.mode.constant.PizzaConstant;
import com.cheermorning.mode.created.abstractfactory.pizza.LDCheesePizza;
import com.cheermorning.mode.created.abstractfactory.pizza.LDGreekPizza;
import com.cheermorning.mode.created.abstractfactory.pizza.LDPepperPizza;
import com.cheermorning.mode.created.abstractfactory.pizza.Pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-16
 */
public class LDFactory implements AbsFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals(PizzaConstant.GREEK)) {
            pizza = new LDGreekPizza();
        } else if (orderType.equals(PizzaConstant.CHEESE)) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals(PizzaConstant.PEPPER)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
