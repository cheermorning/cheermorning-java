package com.cheermorning.mode.behavior.strategy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public abstract class Duck {

    public abstract void display();

    public void yell(){
        System.out.println("鸭子在嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子在游泳");
    }
}
