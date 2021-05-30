package com.cheermorning.principle.singleresponsibility;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单一职责原则
 * @date 2021-4-9
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");

    }
}

/**
 * 分析：
 * 违反单一职责原则， 飞机不能在公路上运行
 */
class Vehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行......");
    }
}