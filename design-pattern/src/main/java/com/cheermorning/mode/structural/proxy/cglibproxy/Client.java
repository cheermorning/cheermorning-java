package com.cheermorning.mode.structural.proxy.cglibproxy;


/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-12
 */
public class Client {

    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，调用代理实例，进行被代理对象的强转型
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao)proxyFactory.getProxyInstance();
        //通过代理对象，调用被代理对象中的方法
        proxyInstance.teach("尹臣");
    }
}
