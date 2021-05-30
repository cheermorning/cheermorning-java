package com.cheermorning.mode.behavior.memento.game;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-27
 */
public class Memento {

    //攻击力
    private int vit;
    //防御力
    private int dev;


    public Memento(int vit, int dev) {
        this.vit = vit;
        this.dev = dev;
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
