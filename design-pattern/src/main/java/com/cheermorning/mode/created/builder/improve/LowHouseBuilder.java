package com.cheermorning.mode.created.builder.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
public class LowHouseBuilder extends HouseBuilder {
    @Override
    void buildPile() {
        System.out.println("矮房子 打桩2米深");
    }

    @Override
    void buildWall() {
        System.out.println("矮房子 砌墙40厘米厚");
    }

    @Override
    void buildTop() {
        System.out.println("矮房子 封顶10米高");
    }
}
