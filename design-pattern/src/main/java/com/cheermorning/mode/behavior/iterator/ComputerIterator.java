package com.cheermorning.mode.behavior.iterator;

import java.util.Iterator;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class ComputerIterator implements Iterator {

    //数组
    Department[] departments;
    int position = 0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }
}
