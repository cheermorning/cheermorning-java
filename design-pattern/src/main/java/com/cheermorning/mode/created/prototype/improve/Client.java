package com.cheermorning.mode.created.prototype.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-20
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式实现羊的克隆");
        Sheep sheep = new Sheep("羊", 20, "白色");

        for (int i = 0; i < 10; i++){
            Sheep sheep1 = (Sheep) sheep.clone();

            System.out.println(sheep1);
        }

        System.out.println("第一只羊");
        System.out.println(sheep);


    }
}
