package com.cheermorning.mode.behavior.iterator;

import java.util.Iterator;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class ComputerCollege implements College{

    Department[] departments;
    /**
     * 数组个数
     */
    int num = 0;

    public ComputerCollege() {
        departments = new  Department[3];
        addDepart("Java");
        addDepart("Python");
        addDepart("Vue");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepart(String name) {
        Department department = new Department(name);
        departments[num] = department;
        num+=1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerIterator(departments);
    }
}
