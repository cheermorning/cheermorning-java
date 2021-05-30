package com.cheermorning.mode.created.singleton.type4;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单例模式：懒汉式（线程不安全）
 * @date 2021-4-13
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("懒汉式2（线程安全）");
        //单例模式对象hashCode值一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1.hashCode="+singleton1.hashCode());
        System.out.println("singleton2.hashCode="+singleton2.hashCode());
        System.out.println(singleton1 == singleton2); //true
    }
}

/**
 * 懒汉式（线程安全）
 * 1. 优点： 解决了线程不安全的问题，但是同步太耗时间了
 * 2. 缺点： 每次获取实例都要同步，效率太低了，不推荐使用这种方式
 */
class Singleton{

    //1. 构造器私有化，外部不能直接new
    private Singleton(){

    }

    //2. 在类内部创建一个类实例对象
    private static Singleton instance;


    //3. 创建一个公有的静态方法，在调用该方法时，才创建instance对象, 增加同步代码，解决了线程不安全的问题
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}

