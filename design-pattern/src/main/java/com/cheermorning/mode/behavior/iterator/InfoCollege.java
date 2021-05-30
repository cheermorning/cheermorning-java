package com.cheermorning.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public class InfoCollege implements College {

    List<Department> departmentList;

    @Override
    public String getName() {
        return "信息学院";
    }

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepart("信息");
        addDepart("网络");
        addDepart("电商");
    }

    @Override
    public void addDepart(String name) {
        Department department = new Department(name);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoIterator(departmentList);
    }
}
