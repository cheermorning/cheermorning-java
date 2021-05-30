package com.cheermorning.mode.behavior.observer.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-26
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
