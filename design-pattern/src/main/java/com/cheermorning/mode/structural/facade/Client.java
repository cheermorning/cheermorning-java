package com.cheermorning.mode.structural.facade;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        HomeTheaterFacade htf = new HomeTheaterFacade();

        htf.ready();

        htf.play();

        //播放6秒
        Thread.sleep(6000L);
        htf.end();
    }
}
