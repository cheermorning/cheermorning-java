package com.cheermorning.mode.behavior.command;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public class TVOffCommand implements Command {

    //聚合
    TVReceiver receiver;

    public TVOffCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
