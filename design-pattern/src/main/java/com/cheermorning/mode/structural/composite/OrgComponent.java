package com.cheermorning.mode.structural.composite;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 组织架构 抽象类
 * @date 2021-5-9
 */
public abstract class OrgComponent {

    private String name;
    private String desc;

    public OrgComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected void add(OrgComponent org){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrgComponent org){
        throw new UnsupportedOperationException();
    }


    public abstract void print();
}
