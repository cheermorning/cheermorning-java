package com.cheermorning.mode.created.abstractfactory.order;

import com.cheermorning.mode.constant.PizzaConstant;
import com.cheermorning.mode.created.abstractfactory.pizza.BJCheesePizza;
import com.cheermorning.mode.created.abstractfactory.pizza.BJGreekPizza;
import com.cheermorning.mode.created.abstractfactory.pizza.BJPepperPizza;
import com.cheermorning.mode.created.abstractfactory.pizza.Pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-16
 */
public class BJFactory implements AbsFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals(PizzaConstant.GREEK)) {
            pizza = new BJGreekPizza();
        } else if (orderType.equals(PizzaConstant.CHEESE)) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals(PizzaConstant.PEPPER)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
