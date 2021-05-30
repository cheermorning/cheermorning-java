package com.cheermorning.mode.created.singleton.type8;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 枚举
 * @date 2021-4-14
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("枚举实现单例模式");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance2.hashCode="+instance2.hashCode());
        System.out.println(instance==instance2);
        instance.sayHello();
    }
}


enum Singleton{
    INSTANCE;
    
    public void sayHello(){
        System.out.println("Hello Singleton");
    }
}