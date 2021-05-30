package com.cheermorning.principle.singleresponsibility.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-9
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");

    }
}

/**
 * 分析：
 * 虽然类违反单一职责原则， 但是由于方法比较少，可以保证方法遵守单一职责原则即可
 */
class Vehicle2{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行......");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空中运行......");
    }public void runWater(String vehicle) {
        System.out.println(vehicle + "在河水中运行......");
    }

}



