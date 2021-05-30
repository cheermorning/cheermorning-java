package com.cheermorning.mode.behavior.command;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public interface Command {

    /**
     * 执行
     */
    public void exec();

    /**
     * 撤销
     */
    public void undo();
}
