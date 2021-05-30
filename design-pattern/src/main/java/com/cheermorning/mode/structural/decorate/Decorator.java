package com.cheermorning.mode.structural.decorate;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink drink){ //组合方式
        this.obj = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " && " + obj.getDesc();
    }
}
