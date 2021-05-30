package com.cheermorning.mode.structural.proxy.dynamicproxy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-11
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        ITeacherDao teacherDao = new TeacherDao();
        //创建代理对象，调用代理实例，进行被代理对象的强转型
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        //通过代理对象，调用被代理对象中的方法
        proxyInstance.teach();
    }
}
