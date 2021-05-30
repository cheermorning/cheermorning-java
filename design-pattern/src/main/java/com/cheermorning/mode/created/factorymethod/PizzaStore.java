package com.cheermorning.mode.created.factorymethod;

import com.cheermorning.mode.constant.PizzaConstant;
import com.cheermorning.mode.created.factorymethod.order.BJPizzaOrder;
import com.cheermorning.mode.created.factorymethod.order.LDPizzaOrder;

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
        if(address.equalsIgnoreCase(PizzaConstant.BJ)){
            new BJPizzaOrder();
        }else if(address.equalsIgnoreCase(PizzaConstant.LD)){
            new LDPizzaOrder();
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
