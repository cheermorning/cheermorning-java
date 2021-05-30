package com.cheermorning.mode.created.simplefactory.pizza;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 披萨
 * @date 2021-4-14
 */
public abstract class Pizza {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(name + "baking");
    }

    public void cut(){
        System.out.println(name + "cutting");
    }

    public void box(){
        System.out.println(name + "boxing");
    }
}
