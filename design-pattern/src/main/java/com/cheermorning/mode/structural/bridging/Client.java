package com.cheermorning.mode.structural.bridging;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("======================");

        UpRightPhone urp = new UpRightPhone(new Vivo());

        urp.desc();
        urp.open();
        urp.call();
        urp.close();

        System.out.println("======================");


        UpRightPhone urp2 = new UpRightPhone(new Oppo());

        urp2.desc();
        urp2.open();
        urp2.call();
        urp2.close();

        System.out.println("======================");


        ClamshellPhone csp = new ClamshellPhone(new Vivo());

        csp.desc();
        csp.open();
        csp.call();
        csp.close();

        System.out.println("======================");


        ClamshellPhone csp2 = new ClamshellPhone(new Oppo());

        csp2.desc();
        csp2.open();
        csp2.call();
        csp2.close();

        System.out.println("======================");

        ClamshellPhone csp3 = new ClamshellPhone(new Honor());

        csp3.desc();
        csp3.open();
        csp3.call();
        csp3.close();

        System.out.println("======================");
    }
}
