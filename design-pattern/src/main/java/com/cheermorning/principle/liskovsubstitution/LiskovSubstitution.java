package com.cheermorning.principle.liskovsubstitution;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 里氏替换原则
 * @date 2021-4-11
 */
public class LiskovSubstitution {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("13-4=" + a.func1(13,4));
        System.out.println("1-9=" + a.func1(1,9));

        B b = new B();
        //本意是减法，结果是加法
        System.out.println("13-4=" + b.func1(13,4));
        //本意是减法，结果是加法，
        System.out.println("1-9=" + b.func1(1,9));
        System.out.println("12+7=" + b.func2(12,7));
    }
}

class A{
    public Integer func1(int a, int b){
        return a-b;
    }
}
class B extends A{

    //重写A的func1,进行加法
    @Override
    public Integer func1(int a, int b){
        return a+b;
    }

    public Integer func2(int a, int b){
        return func1(a,b) + 9;
    }
}
