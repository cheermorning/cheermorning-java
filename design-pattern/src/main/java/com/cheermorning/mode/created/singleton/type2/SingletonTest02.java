package com.cheermorning.mode.created.singleton.type2;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单例模式：饿汉式（静态代码块）
 * @date 2021-4-13
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        System.out.println("饿汉式（静态代码块）");
        //单例模式对象hashCode值一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1.hashCode="+singleton1.hashCode());
        System.out.println("singleton2.hashCode="+singleton2.hashCode());
        System.out.println(singleton1 == singleton2); //true
    }
}

/**
 * 饿汉式（静态代码块：和静态变量一样）
 * 1. 优点： 在类加载的时候就实例化，避免了线程同步的问题；
 * 2. 缺点： 在类加载的时候就实例化，无法形成懒加载的效果；
 *          而且我们也不能保证只在调用getInstance()方法时，进行类加载，有可能其他方式也会造成类加载
 */
class Singleton{

    //1. 构造器私有化，外部不能直接new
    private Singleton(){

    }

    //2. 在类内部创建一个类实例对象
    private static Singleton instance;

    //3. 在静态代码块中创建对象
    static {
        instance = new Singleton();
    }

    //4. 创建一个公有的静态方法，供外部使用
    public static Singleton getInstance(){
        return instance;
    }
}

