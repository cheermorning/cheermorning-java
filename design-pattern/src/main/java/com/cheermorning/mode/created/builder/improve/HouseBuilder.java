package com.cheermorning.mode.created.builder.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
public abstract class HouseBuilder {

    protected House house = new House();

    abstract void buildPile();
    abstract void buildWall();
    abstract void buildTop();

    public House build(){
        return house;
    }
}
