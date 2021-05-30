package com.cheermorning.mode.created.prototype;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-20
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("普通方式");
        Sheep sheep = new Sheep("羊", 20, "白色");

        for (int i = 0; i < 10; i++){
            Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

            System.out.println(sheep1);
        }

        System.out.println("第一只羊");
        System.out.println(sheep);


    }
}
