package com.cheermorning.mode.structural.facade;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 家庭影院
 * @date 2021-5-9
 */
public class HomeTheaterFacade {

    private Popcorn popcorn;
    private Screen screen;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //家庭影院分为4步：准备、播放、暂停、结束
    public void ready(){
        popcorn.on();
        popcorn.pop();
        projector.on();
        screen.down();
        dvdPlayer.on();
        stereo.on();
        theaterLight.dim();
    }

    public void play(){
        popcorn.take();
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
        stereo.up();
        popcorn.off();
    }

    public void end(){
        stereo.off();
        dvdPlayer.off();
        projector.off();
        screen.up();
        theaterLight.bright();
    }
}
