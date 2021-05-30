package com.cheermorning.mode.behavior.template.hook;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("==========制作红豆豆浆============");
        SoyaMilk redBean = new RedBeanSoyaMilk();
        redBean.make();
        System.out.println("==========制作花生豆浆============");
        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();

        System.out.println("==========制作纯豆浆============");
        SoyaMilk pure = new PureSoyaMilk();
        pure.make();
    }
}
