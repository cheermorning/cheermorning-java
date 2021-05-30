package com.cheermorning.mode.created.abstractfactory.order;

import com.cheermorning.mode.created.abstractfactory.pizza.Pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-16
 */
public interface AbsFactory {

    public Pizza createPizza(String orderType);
}
