package com.cheermorning.mode.created.builder.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
public class HouseCommander {

    private HouseBuilder builder = null;

    //1. 构造器

    public HouseCommander(HouseBuilder builder) {
        this.builder = builder;
    }

    //2. set方法

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    //3. 建房流程

    public House buildHouse(){
        builder.buildPile();
        builder.buildWall();
        builder.buildTop();
        return builder.build();
    }
}
