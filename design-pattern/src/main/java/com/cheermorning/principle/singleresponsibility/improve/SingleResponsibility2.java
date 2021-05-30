package com.cheermorning.principle.singleresponsibility.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-9
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

    }
}

/**
 * 分析：
 * 类都单一职责原则，但是性能消耗比较高
 */
class RoadVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行......");
    }
}

class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空中运行......");
    }
}
class WaterVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在河水中运行......");
    }
}

