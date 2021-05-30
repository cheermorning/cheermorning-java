package com.cheermorning.mode.behavior.memento.game;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-27
 */
public class Originator {

    //攻击力
    private int vit;
    //防御力
    private int dev;


    public Memento saveMemento(){
        return  new Memento(this.vit, this.dev);
    }

    public void getMemento(Memento memento){
        this.vit = memento.getVit();
        this.dev = memento.getDev();
    }

    public void display(){
        System.out.println("攻击力：" + this.vit + ", 防御力：" + this.dev);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDev() {
        return dev;
    }

    public void setDev(int dev) {
        this.dev = dev;
    }
}
