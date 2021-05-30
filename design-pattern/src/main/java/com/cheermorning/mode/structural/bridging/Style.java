package com.cheermorning.mode.structural.bridging;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public abstract class Style {

    private Brand brand;

    public Style(Brand brand){
        super();
        this.brand = brand;
    }


    public void open(){
        this.brand.open();
    }

    public void close(){
        this.brand.close();
    }


    public void call(){
        this.brand.call();
    }

    public abstract void desc();
}
