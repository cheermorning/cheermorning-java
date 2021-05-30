package com.cheermorning.mode.behavior.visitor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 这里使用到了双分派，
 * @date 2021-5-25
 */
public class MathTeacher extends Teacher {


    @Override
    public void accept(Grade grade) {
        grade.getMathGrade(this);
    }
}
