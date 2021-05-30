package com.cheermorning.mode.structural.adapter.interfaceadapter;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-26
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("这是从匿名内部类中实现m1方法，演示接口适配器");
            }
        };
        absAdapter.m1();

        //HandlerAdapter
    }
}
