package com.cheermorning.principle.segregation.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 接口隔离原则
 * @date 2021-4-10
 * 接口隔离原则 Interface Segregation Principle
 *
 * 客户端不应该依赖它不需要的接口, 即一个类对另一个类的依赖应该建立在最小的接口之上。
 *
 */
public class Segregation2 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}


/**
 * 接口1
 */
interface Interface1 {
    void operation1();
}
interface Interface2 {

    void operation2();

    void operation3();


}
interface Interface3 {
    void operation4();

    void operation5();
}

class B implements Interface1,Interface2 {

    public void operation1() {
        System.out.println("B 实现了 Interface1的operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 Interface1的operation2");
    }

    public void operation3() {
        System.out.println("B 实现了 Interface1的operation3");
    }
}

class D implements Interface1,Interface3 {

    public void operation1() {
        System.out.println("D 实现了 Interface1的operation1");
    }

    public void operation4() {
        System.out.println("D 实现了 Interface1的operation4");
    }

    public void operation5() {
        System.out.println("D 实现了 Interface1的operation5");
    }
}

class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}