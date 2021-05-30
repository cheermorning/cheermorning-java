package com.cheermorning.mode.structural.decorate;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2.0f);
    }
}
