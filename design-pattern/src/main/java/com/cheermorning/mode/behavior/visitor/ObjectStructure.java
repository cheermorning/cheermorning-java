package com.cheermorning.mode.behavior.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-25
 */
public class ObjectStructure {

    private List<Teacher> teachers = new LinkedList<Teacher>();


    //添加老师
    public void attach(Teacher teacher){
        teachers.add(teacher);
    }

    //移除老师
    public void detach(Teacher teacher){
        teachers.remove(teacher);
    }

    //展示
    public void display(Grade grade){
        for (Teacher teacher : teachers) {
            teacher.accept(grade);
        }
    }
}
