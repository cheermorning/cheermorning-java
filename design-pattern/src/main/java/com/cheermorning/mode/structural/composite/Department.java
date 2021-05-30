package com.cheermorning.mode.structural.composite;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Department extends OrgComponent {


    public Department(String name, String desc){
        super(name, desc);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
