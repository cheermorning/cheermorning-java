package com.cheermorning.mode.created.singleton.type5;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单例模式：懒汉式（线程安全,同步代码块，有问题，不能使用）
 * @date 2021-4-13
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("懒汉式2（线程安全, 同步代码块）");
        //单例模式对象hashCode值一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1.hashCode="+singleton1.hashCode());
        System.out.println("singleton2.hashCode="+singleton2.hashCode());
        System.out.println(singleton1 == singleton2); //true
    }
}

/**
 * 懒汉式（线程安全， 同步代码块）， 不能解决任何问题
 */
class Singleton{

    //1. 构造器私有化，外部不能直接new
    private Singleton(){

    }

    //2. 在类内部创建一个类实例对象
    private static Singleton instance;


    //3. 创建一个公有的静态方法，在调用该方法时，才创建instance对象, 增加同步代码，解决了线程不安全的问题
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class) {
                instance = new Singleton();
            }
        }

        return instance;
    }
}

