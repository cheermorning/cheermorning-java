package com.cheermorning.mode.behavior.visitor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-25
 */
public class Favorable extends Grade {
    @Override
    public void getMathGrade(MathTeacher teacher) {
        System.out.println("数学老师说：数学成绩良好！！");
    }

    @Override
    public void getChineseGrade(ChineseTeacher teacher) {
        System.out.println("语文老师说：语文成绩良好！！");
    }

    @Override
    public void getEnglishGrade(EnglishTeacher teacher) {
        System.out.println("英语老师说：英语成绩良好！！");
    }
}
