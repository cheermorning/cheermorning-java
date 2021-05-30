package com.cheermorning.mode.created.simplefactory.improve;

import com.cheermorning.mode.created.simplefactory.pizza.GreekPizza;
import com.cheermorning.mode.created.simplefactory.pizza.PepperPizza;
import com.cheermorning.mode.created.simplefactory.pizza.Pizza;
import com.cheermorning.mode.created.simplefactory.pizza.CheesePizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 简单工厂模式
 * @date 2021-4-14
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        System.out.println("采用简单工厂模式订购披萨");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }

    //静态方法：简单工厂也叫静态工厂
    public static Pizza createPizzaStatic(String orderType){
        System.out.println("采用简单工厂模式订购披萨");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        }
        return pizza;
    }
}
