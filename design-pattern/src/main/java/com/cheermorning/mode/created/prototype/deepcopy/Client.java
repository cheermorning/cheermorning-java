package com.cheermorning.mode.created.prototype.deepcopy;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-20
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型模式实现深拷贝");
        Tiger tiger = new Tiger();
        tiger.info="羊入虎口";
        tiger.sheep =new Sheep("Tom", 1, "白色");
       Tiger tiger1 = (Tiger) tiger.deepClone();
        System.out.println(tiger.info+ ",Sheep.hashCode():" + tiger.sheep.hashCode());
        System.out.println("是纸老虎");
        System.out.println(tiger1.info + ",Sheep.hashCode():" + tiger1.sheep.hashCode());

//        DeepPrototype deep = new DeepPrototype();
//        deep.name = "大牛吃小妞";
//        deep.deepCloneableTarget = new DeepCloneableTarget("Jack",  "黑色");
//
//        DeepPrototype deep1 = (DeepPrototype) deep.clone();
//
//        System.out.println(deep.name + ",DeepTarget.hashCode():" + deep.deepCloneableTarget.hashCode());
//        System.out.println("是纸老虎");
//        System.out.println(deep1.name + ",DeepTarget.hashCode():" + deep1.deepCloneableTarget.hashCode());




    }
}
