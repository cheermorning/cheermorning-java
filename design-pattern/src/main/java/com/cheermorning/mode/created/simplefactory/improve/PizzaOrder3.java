package com.cheermorning.mode.created.simplefactory.improve;

import com.cheermorning.mode.created.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 披萨订购订单
 * @date 2021-4-14
 */
public class PizzaOrder3 {

    //创建构造器
    public PizzaOrder3(){
        Pizza pizza = null;
        String orderType = "";
        do{
            orderType = getType();
            pizza =SimpleFactory.createPizzaStatic(orderType);
            if(pizza != null){ //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败！！！");
                break;
            }

        }while (true);
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
