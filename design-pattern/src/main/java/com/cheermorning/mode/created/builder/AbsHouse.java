package com.cheermorning.mode.created.builder;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 建造者模式
 * @date 2021-4-21
 */
public abstract class AbsHouse {

    abstract void buildPile();
    abstract void buildWall();
    abstract void buildTop();

    public void build(){
        this.buildPile();
        this.buildWall();
        this.buildTop();
    }
}
