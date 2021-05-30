package com.cheermorning.mode.behavior.visitor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-25
 */
public class ChineseTeacher extends Teacher{
    @Override
    public void accept(Grade grade) {
        grade.getChineseGrade(this);
    }
}
