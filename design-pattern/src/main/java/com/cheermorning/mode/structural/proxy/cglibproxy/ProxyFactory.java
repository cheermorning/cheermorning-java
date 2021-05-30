package com.cheermorning.mode.structural.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-12
 */
public class ProxyFactory implements MethodInterceptor {


    //目标对象属性
    private Object target;

    //构造器
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回target的代理对象
     * @return
     */
    public Object getProxyInstance(){
        //1. 创建工具类
        Enhancer enhancer = new Enhancer();
        //2, 找父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建目标对象的子类
        return enhancer.create();

    }

    /**
     * 重写，会调用目标对象的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理开始~~");
        Object resultVal = method.invoke(target, objects);
        System.out.println("Cglib代理提交~~");
        return resultVal;
    }
}
