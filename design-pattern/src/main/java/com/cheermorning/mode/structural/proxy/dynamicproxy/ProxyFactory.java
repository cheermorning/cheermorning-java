package com.cheermorning.mode.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-11
 */
public class ProxyFactory {

    private Object target; //被代理对象

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){

        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *
         * 1. ClassLoader loader: 是指目标对象的类加载器，进行方法固定
         * 2. Class<?>[] interfaces: 是指目标对象的接口类型
         * 3. h 事件处理，当执行目标对象的方法是，会触发事件处理器方法，会把当前执行的目标方法以参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始~~");
                        method.invoke(target, args);
                        System.out.println("JDK代理提交~~");
                        return null;
                    }
                });
    }
}
