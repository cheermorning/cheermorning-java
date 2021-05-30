package com.cheermorning.mode.created.simplefactory.order;

import com.cheermorning.mode.created.simplefactory.pizza.GreekPizza;
import com.cheermorning.mode.created.simplefactory.pizza.PepperPizza;
import com.cheermorning.mode.created.simplefactory.pizza.Pizza;
import com.cheermorning.mode.created.simplefactory.pizza.CheesePizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 披萨订购订单
 * @date 2021-4-14
 */
public class PizzaOrder {



    public PizzaOrder(){
        Pizza pizza = null;
        //订购披萨的类型
        String orderType ;
        do{
            orderType = getType();
            if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
			} else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName(" 胡椒披萨 ");
            }  else {
				break;
			}
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
        }
        while (true);


    }

    private String getType(){
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入 Pizza 种类：");

            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
