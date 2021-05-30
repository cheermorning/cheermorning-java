package com.cheermorning.source.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-20
 */
public class ProtoTypeTest
{

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("application-core.xml");

        Object bean =  context.getBean("id01");
        Object bean2 =  context.getBean("id01");

        System.out.println(bean);
        System.out.println(bean2);
        System.out.println("两个不同的对象，属性一样");
        System.out.println(bean == bean2);
        System.out.println("这里用到了原型模式: org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(java.lang.String, org.springframework.beans.factory.support.RootBeanDefinition, java.lang.Object[])");


    }
}
