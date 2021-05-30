package com.cheermorning.mode.structural.decorate;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */

public class Coffee extends Drink {
    @Override
    public float cost() {
       return super.getPrice();
    }
}
