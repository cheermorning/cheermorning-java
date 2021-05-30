package com.cheermorning.mode.behavior.memento.theory;

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

        originator.setState("状态#1为 1000");

        //保存当前状态
        caretaker.add(originator.saveState());

        originator.setState("状态#2为 700");

        //保存当前状态
        caretaker.add(originator.saveState());

        originator.setState("状态#3为 300");

        //保存当前状态
        caretaker.add(originator.saveState());

        System.out.println("当前状态：" + originator.getState());

        //恢复到1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态#1");
        System.out.println("当前状态：" + originator.getState());
    }
}
