package com.cheermorning.mode.created.abstractfactory;

import com.cheermorning.mode.constant.PizzaConstant;
import com.cheermorning.mode.created.abstractfactory.order.BJFactory;
import com.cheermorning.mode.created.abstractfactory.order.LDFactory;
import com.cheermorning.mode.created.abstractfactory.order.PizzaOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-15
 */
public class PizzaStore {

    public static void main(String[] args) {
        String address = getAddress();
        PizzaOrder order = new PizzaOrder();
        if(address.equalsIgnoreCase(PizzaConstant.BJ)){
            order.getFactory(new BJFactory());
        }else if(address.equalsIgnoreCase(PizzaConstant.LD)){
            order.getFactory(new LDFactory());
        }
    }

    private static String getAddress(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入地址：");

            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
