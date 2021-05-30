package com.cheermorning.mode.created.factorymethod.order;


import com.cheermorning.mode.created.factorymethod.pizza.Pizza;
import com.cheermorning.mode.util.PizzaUtils;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 披萨订购订单
 * @date 2021-4-14
 */
public abstract class PizzaOrder {

    abstract Pizza createPizza(String orderType);

    public PizzaOrder(){
        Pizza pizza = null;
        //订购披萨的类型
        String orderType = "";
        do{
            orderType = PizzaUtils.getType();
            pizza = createPizza(orderType);
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
        }
        while (true);
    }


}
