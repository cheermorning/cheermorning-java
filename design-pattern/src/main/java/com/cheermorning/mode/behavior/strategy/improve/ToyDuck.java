package com.cheermorning.mode.behavior.strategy.improve;


/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        swimBehavior = new NoSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
