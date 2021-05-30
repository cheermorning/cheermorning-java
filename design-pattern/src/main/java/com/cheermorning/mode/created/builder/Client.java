package com.cheermorning.mode.created.builder;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
public class Client {

    public static void main(String[] args) {
//        AbsHouse absHouse = new LowHouse();
AbsHouse absHouse = new HighHouse();
        absHouse.build();
    }
}
