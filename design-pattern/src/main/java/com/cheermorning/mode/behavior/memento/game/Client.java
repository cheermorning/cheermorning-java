package com.cheermorning.mode.behavior.memento.game;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-27
 */
public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();

        originator.setVit(3000);
        originator.setDev(1000);

        System.out.println("大战前!");
        originator.display();

        //保存当前状态
        caretaker.setMemento(originator.saveMemento());

        System.out.println("大战后!!");
        originator.setVit(1500);
        originator.setDev(700);
        originator.display();

        //恢复到1
        System.out.println("恢复到巅峰状态!!!");
        originator.getMemento(caretaker.getMemento());
        originator.display();
    }
}
