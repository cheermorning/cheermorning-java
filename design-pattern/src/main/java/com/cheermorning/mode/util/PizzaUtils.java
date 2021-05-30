package com.cheermorning.mode.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-16
 */
public class PizzaUtils {

    public static String getType(){
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
