package com.cheermorning.mode.created.factorymethod.order;

import com.cheermorning.mode.constant.PizzaConstant;
import com.cheermorning.mode.created.factorymethod.pizza.LDCheesePizza;
import com.cheermorning.mode.created.factorymethod.pizza.LDGreekPizza;
import com.cheermorning.mode.created.factorymethod.pizza.LDPepperPizza;
import com.cheermorning.mode.created.factorymethod.pizza.Pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-15
 */
public class LDPizzaOrder extends PizzaOrder {

    @Override
    Pizza createPizza(String orderType) {
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
