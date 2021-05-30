package com.cheermorning.mode.behavior.strategy.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public class BadSwimBehavior implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("游泳技术一般");
    }
}
