package com.cheermorning.uml.aggregation;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-11
 */
public class Computer {
    private Mouse mouse;

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
