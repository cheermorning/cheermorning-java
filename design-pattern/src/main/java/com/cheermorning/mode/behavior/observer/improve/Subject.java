package com.cheermorning.mode.behavior.observer.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public interface Subject {

    //注册
    void register(Observer observer);
    //移除
    void remove(Observer observer);
    //通知所有
    void notifyAllObs();
}
