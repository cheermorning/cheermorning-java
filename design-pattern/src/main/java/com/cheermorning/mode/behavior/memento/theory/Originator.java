package com.cheermorning.mode.behavior.memento.theory;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-27
 */
public class Originator {

    private String state;



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
