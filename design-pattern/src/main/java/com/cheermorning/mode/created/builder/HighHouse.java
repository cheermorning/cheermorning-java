package com.cheermorning.mode.created.builder;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-21
 */
public class HighHouse extends AbsHouse {
    @Override
    void buildPile() {
        System.out.println("高房子 打桩5米深");
    }

    @Override
    void buildWall() {
        System.out.println("高房子 砌墙60厘米厚");
    }

    @Override
    void buildTop() {
        System.out.println("高房子 封顶30米高");
    }
}
