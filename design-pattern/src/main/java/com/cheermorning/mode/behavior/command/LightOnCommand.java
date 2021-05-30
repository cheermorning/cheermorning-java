package com.cheermorning.mode.behavior.command;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public class LightOnCommand implements Command {

    //聚合
    LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
