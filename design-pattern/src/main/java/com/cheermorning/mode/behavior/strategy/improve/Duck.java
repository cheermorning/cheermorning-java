package com.cheermorning.mode.behavior.strategy.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public abstract class Duck {

    SwimBehavior swimBehavior;

    public Duck() {
    }

    public abstract void display();

    public void yell(){
        System.out.println("鸭子在嘎嘎叫");
    }

    public void swim(){
        //改进
        if(swimBehavior != null){
            swimBehavior.swim();
        }
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}
