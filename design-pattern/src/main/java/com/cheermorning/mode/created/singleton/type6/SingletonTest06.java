package com.cheermorning.mode.created.singleton.type6;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单例模式：双重检查，推荐使用
 * @date 2021-4-13
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("双重检查");
        //单例模式对象hashCode值一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1.hashCode=" + singleton1.hashCode());
        System.out.println("singleton2.hashCode=" + singleton2.hashCode());
        System.out.println(singleton1 == singleton2); //true
    }
}

/**
 * 双重检查Double_Check
 * 1. 优点，进行多重判断，更有效
 * 2. 推荐使用这种方式
 */
class Singleton {

    //1. 构造器私有化，外部不能直接new
    private Singleton() {

    }

    //2. 在类内部创建一个类实例对象
    private static volatile Singleton instance;


    //3. 创建一个公有的静态方法，
    // 在调用该方法时，才创建instance对象,
    // 双重检查，既解决了线程不安全问题，又解决了懒加载的问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

