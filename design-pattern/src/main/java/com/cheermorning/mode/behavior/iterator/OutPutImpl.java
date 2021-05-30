package com.cheermorning.mode.behavior.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //输出学院和系
    public void printCollege(){
        for (College college : collegeList) {
            System.out.println("===========" + college.getName() + "===========");
            printDepart(college.createIterator());
        }
    }


    //输出系
    public void printDepart(Iterator iterator){
        while (iterator.hasNext()){
            Department  department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
