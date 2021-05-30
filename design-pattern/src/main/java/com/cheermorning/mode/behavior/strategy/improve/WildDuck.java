package com.cheermorning.mode.behavior.strategy.improve;


/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public class WildDuck extends Duck {

    public WildDuck() {
        swimBehavior = new GoodSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }
}
