package com.cheermorning.mode.structural.facade;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class DVDPlayer {

    public DVDPlayer() {
    }

    /**
     *饿汉式 单例模式
     */
    private static final DVDPlayer INSTANCE = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return INSTANCE;
    }

    public void on(){
        System.out.println("DVDPlayer on");
    }

    public void play(){
        System.out.println("DVDPlayer playing ...");
    }

    public void pause(){
        System.out.println("DVDPlayer pausing ...");
    }

    public void off(){
        System.out.println("DVDPlayer off");
    }
}
