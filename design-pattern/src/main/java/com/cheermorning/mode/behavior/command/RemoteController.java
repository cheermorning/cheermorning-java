package com.cheermorning.mode.behavior.command;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public class RemoteController {

    //开
    Command[] onCommands;
    //关
    Command[] offCommands;
    //撤销
    Command undoCommand;

    //构造器，完成按钮初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i= 0; i<5; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //设置命令

    public void setCommand(int num, Command onCommand, Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int num){
        //找到按钮，并调用对应方法
        onCommands[num].exec();
        //记录本次操作，并用于撤销
        undoCommand = onCommands[num];
    }

    public void offButtonWasPushed(int num){
        //找到按钮，并调用对应方法
        offCommands[num].exec();
        //记录本次操作，并用于撤销
        undoCommand = offCommands[num];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
