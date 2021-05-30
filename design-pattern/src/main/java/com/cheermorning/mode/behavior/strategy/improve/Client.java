package com.cheermorning.mode.behavior.strategy.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.swim();
        System.out.println("=====================");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.swim();

        //动态改变某个对象的行为, 北京鸭 不能飞
        System.out.println("=====================");
        toyDuck.setSwimBehavior(new BadSwimBehavior());
        System.out.println("玩具鸭实际也能游泳，不过要人帮忙");
        toyDuck.display();
        toyDuck.swim();
    }
}
