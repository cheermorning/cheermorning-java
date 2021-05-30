package com.cheermorning.mode.behavior.visitor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 成绩
 * @date 2021-5-25
 */
public abstract class Grade {

    //获取数学老师的成绩测评
    public abstract void getMathGrade(MathTeacher teacher);
    //获取语文老师的成绩测评
    public abstract void getChineseGrade(ChineseTeacher teacher);
    //获取英语老师的成绩测评
    public abstract void getEnglishGrade(EnglishTeacher teacher);


}
