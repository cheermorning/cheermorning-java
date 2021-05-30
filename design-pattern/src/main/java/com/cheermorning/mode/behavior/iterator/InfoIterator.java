package com.cheermorning.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 信息
 * @date 2021-5-26
 */
public class InfoIterator implements Iterator {

    List<Department> departmentList = new ArrayList<Department>();

    public InfoIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    int index = -1;
    @Override
    public boolean hasNext() {

        if(index >= departmentList.size() -1) {
            return false;
        }else{
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
