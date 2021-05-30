package com.cheermorning.principle.liskovsubstitution.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 里氏替换原则
 * @date 2021-4-11
 */
public class LiskovSubstitutionImprove {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("13-4=" + a.func1(13,4));
        System.out.println("1-9=" + a.func1(1,9));

        B b = new B();
        //本意是加法，结果是加法
        System.out.println("13+4=" + b.func1(13,4));
        //本意是加法，结果是加法，
        System.out.println("1+9=" + b.func1(1,9));
        System.out.println("12+7=" + b.func2(12,7));
        //采用依赖、聚合、组合进行里氏替换
        System.out.println("12-7=" + b.func3(12,7));

    }
}

class Base{

}

class A extends Base{
    public Integer func1(int a, int b){
        return a-b;
    }
}

class B extends Base {

    //重写A的func1,进行加法
    public Integer func1(int a, int b){
        return a+b;
    }

    public Integer func2(int a, int b){
        return func1(a,b) + 9;
    }

    private A a = new A();

    public Integer func3(int a, int b){
        return this.a.func1(a,b);
    }
}
