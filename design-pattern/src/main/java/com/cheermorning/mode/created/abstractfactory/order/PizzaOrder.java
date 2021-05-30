package com.cheermorning.mode.created.abstractfactory.order;


import com.cheermorning.mode.created.abstractfactory.pizza.Pizza;
import com.cheermorning.mode.util.PizzaUtils;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 披萨订购订单
 * @date 2021-4-14
 */
public class PizzaOrder {

    public PizzaOrder() {
    }

    public void getFactory(AbsFactory factory){
        Pizza pizza = null;
        //订购披萨的类型
        String orderType ;
        do{
            orderType = PizzaUtils.getType();
            pizza = factory.createPizza(orderType);
            if(pizza != null) {
                //输出pizza 制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败！！！");
                break;
            }
        }
        while (true);
    }


}
