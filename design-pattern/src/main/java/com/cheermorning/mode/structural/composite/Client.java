package com.cheermorning.mode.structural.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class Client {

    public static void main(String[] args) {

        //显示大学的组织架构

        //大学
        OrgComponent u = new University("清华大学","中国顶尖大学");

        //学院
        OrgComponent cc = new College("计算机学院", "新建学院");
        OrgComponent ic = new College("信息技术学院", "老牌学院");

        //将学院添加到大学中
        u.add(cc);
        u.add(ic);

        //将系添加到学院中
        cc.add(new Department("软件工程", "软件工程"));
        cc.add(new Department("网络工程", "网络工程"));
        cc.add(new Department("电子商务", "电子商务"));


        ic.add(new Department("计算机科学与技术", "计算机科学与技术"));
        ic.add(new Department("电子信息科学与技术", "电子信息科学与技术"));
        ic.add(new Department("通信工程", "通信工程"));

        //打印
        u.print();


        //源码分析
        /**
         * Map其实就是一个抽象，Component
         * HashMap就是具体实现，put和putAll 实现或者继承了Map的方法
         */
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "四大名著");
        Map<Integer, String> childMap = new HashMap<Integer, String>();
        childMap.put(1, "西游记");
        childMap.put(2, "红楼梦");
        childMap.put(3, "水浒传");
        childMap.put(4, "三国演义");
        map.putAll(childMap);
        System.out.println(map.toString());
    }
}
