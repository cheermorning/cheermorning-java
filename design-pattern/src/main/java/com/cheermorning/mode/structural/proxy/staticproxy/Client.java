package com.cheermorning.mode.structural.proxy.staticproxy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-11
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，并将被代理对象传递给它
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用被代理对象中的方法
        proxy.teach();
    }
}
