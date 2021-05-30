package com.cheermorning.mode.created.factorymethod.order;

import com.cheermorning.mode.constant.PizzaConstant;
import com.cheermorning.mode.created.factorymethod.pizza.BJCheesePizza;
import com.cheermorning.mode.created.factorymethod.pizza.BJGreekPizza;
import com.cheermorning.mode.created.factorymethod.pizza.BJPepperPizza;
import com.cheermorning.mode.created.factorymethod.pizza.Pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-15
 */
public class BJPizzaOrder extends PizzaOrder {

    @Override
    Pizza createPizza(String orderType) {
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
