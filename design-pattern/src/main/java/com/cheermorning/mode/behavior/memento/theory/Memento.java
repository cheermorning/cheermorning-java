package com.cheermorning.mode.behavior.memento.theory;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-27
 */
public class Memento {

    public Memento(String state) {
        this.state = state;
    }

    private String state;

    public String getState() {
        return state;
    }

}
