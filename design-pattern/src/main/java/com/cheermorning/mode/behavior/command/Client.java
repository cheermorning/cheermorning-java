package com.cheermorning.mode.behavior.command;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public class Client {

    public static void main(String[] args) {

        //灯对象
        LightReceiver lightReceiver = new LightReceiver();

        //命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        //遥控器
        RemoteController remote = new RemoteController();
        //初始化
        remote.setCommand(0, lightOnCommand,lightOffCommand);
        //按钮
        System.out.println("==========开始操作灯===========");
        remote.onButtonWasPushed(0);
        System.out.println("---------关灯-----------");
        remote.offButtonWasPushed(0);
        System.out.println("----------撤销关灯------------");
        remote.undoButtonWasPushed();


        //电视对象
        TVReceiver tvReceiver = new TVReceiver();

        //命令
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        //初始化
        remote.setCommand(1, tvOnCommand,tvOffCommand);
        //按钮
        System.out.println("==========开始操作电视===========");
        remote.offButtonWasPushed(1);
        System.out.println("---------开电视-----------");
        remote.onButtonWasPushed(1);
        System.out.println("----------撤销开电视------------");
        remote.undoButtonWasPushed();
    }
}
