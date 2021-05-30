package com.cheermorning.mode.created.singleton.type3;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单例模式：懒汉式（线程不安全）
 * @date 2021-4-13
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懒汉式（线程不安全）");
        //单例模式对象hashCode值一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1.hashCode="+singleton1.hashCode());
        System.out.println("singleton2.hashCode="+singleton2.hashCode());
        System.out.println(singleton1 == singleton2); //true
    }
}

/**
 * 懒汉式（线程不安全）
 * 1. 优点： 有懒加载的效果，但是只能在单线程下使用
 * 2. 缺点： 不能在多线程中使用，实际开发中，不能使用这种方式
 */
class Singleton{

    //1. 构造器私有化，外部不能直接new
    private Singleton(){

    }

    //2. 在类内部创建一个类实例对象
    private static Singleton instance;


    //3. 创建一个公有的静态方法，在调用该方法时，才创建instance对象
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}

