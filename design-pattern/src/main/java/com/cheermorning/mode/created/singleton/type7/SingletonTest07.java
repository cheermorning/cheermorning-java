package com.cheermorning.mode.created.singleton.type7;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 单例模式：静态内部类，推荐使用
 * @date 2021-4-13
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        //单例模式对象hashCode值一样
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton1.hashCode=" + singleton1.hashCode());
        System.out.println("singleton2.hashCode=" + singleton2.hashCode());
        System.out.println(singleton1 == singleton2); //true
    }
}

/**
 * 静态内部类
 * 1. 这种方式采用了类装载的机制来保证初始化实例是只有一个线程
 * 2. 惊天内部类方式在Singleton类被装载时并不会立即实例化，
 *    而是在需要实例化是，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化
 * 3. 类的静态属性只会在第一次加载类的时候初始化，所以在这里JVM帮助我们保障了线程的安全新，在类进行初始化是，别的线程是无法进入的
 * 4. 优点: 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5. 结论：推荐使用
 */
class Singleton {

    //1. 构造器私有化，外部不能直接new
    private Singleton() {

    }

    //2. 在类内部创建一个静态的内部类，静态初始化Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }


    //3. 创建一个公有的静态方法，
    //返回静态内部类中的静态初始化对象
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

