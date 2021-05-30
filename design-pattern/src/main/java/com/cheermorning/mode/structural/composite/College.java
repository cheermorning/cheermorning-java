package com.cheermorning.mode.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class College extends OrgComponent {

    List<OrgComponent> orgs = new ArrayList<OrgComponent>();

    public College(String name, String desc){
        super(name, desc);
    }

    @Override
    protected void add(OrgComponent org) {
        orgs.add(org);

    }

    @Override
    protected void remove(OrgComponent org) {
        orgs.remove(org);
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
        System.out.println("============"+ getName() +"============");

        for (OrgComponent org : orgs) {
            org.print();
        }
    }
}
