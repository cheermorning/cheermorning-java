package com.cheermorning.mode.behavior.iterator;

import java.util.Iterator;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 学院
 * @date 2021-5-26
 */
public interface College {

    /**
     * 获取学院的名字
     */
    public String getName();

    /**
     * 添加系
     */
    public void addDepart(String name);
    /**
     * 迭代器
     * @return
     */
   public Iterator createIterator();
}
