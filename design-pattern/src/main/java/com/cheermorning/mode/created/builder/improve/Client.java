package com.cheermorning.mode.created.builder.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
public class Client {

    public static void main(String[] args) {

        //1. 建造矮房子
        HouseBuilder builder = new LowHouseBuilder();

        //2. 指挥建房子
        HouseCommander commander = new HouseCommander(builder);

        commander.buildHouse();

        System.out.println("-------------------------");

        //3. 改成建造高房子
        HouseBuilder highBuilder = new HighHouseBuilder();
        commander.setBuilder(highBuilder);
        commander.buildHouse();

        //4. 源码分析
        System.out.println("=========================");
        StringBuilder builder2 = new StringBuilder("hello,builder");
        System.out.println(builder2);
        /**
         * 1. 其实StringBuilder使用的就是部分建造者模式
         *  1）Appendable 接口定义了append方法
         *  2）AbstractStringBuilder 是一个抽象类，实现了Appendable的append方法，所以它是建造者，但是不能实例化
         *  3）StringBuilder继承AbstractStringBuilder，使用的还是父类方法，所以既是建造者，又是指挥者
         */
    }
}
