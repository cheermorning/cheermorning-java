package com.cheermorning.mode.structural.decorate;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Client {

    public static void main(String[] args) {

        //点咖啡订单： 两份巧克力+1份牛奶+一杯LongBlack咖啡
        Drink order = new LongBlack();

        System.out.println("费用1：" + order.cost());
        System.out.println("描述1：" + order.getDesc());
        System.out.println("=========================");

        order = new Milk(order);

        System.out.println("费用2：" + order.cost());
        System.out.println("描述2：" + order.getDesc());
        System.out.println("=========================");

        order = new Chocolate(order);

        System.out.println("费用3：" + order.cost());
        System.out.println("描述3：" + order.getDesc());
        System.out.println("=========================");

        order = new Chocolate(order);

        System.out.println("费用4：" + order.cost());
        System.out.println("描述4：" + order.getDesc());
        System.out.println("=========================");


        //再加一杯无因咖啡
//        order = new NoRef(order);
//
//        System.out.println("费用4：" + order.cost());
//        System.out.println("描述4：" + order.getDesc());
//        System.out.println("=========================");
    }
}
