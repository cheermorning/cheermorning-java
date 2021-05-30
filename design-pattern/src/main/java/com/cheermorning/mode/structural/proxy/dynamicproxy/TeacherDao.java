package com.cheermorning.mode.structural.proxy.dynamicproxy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-11
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("我正在授课 。。。。。。");
    }
}
