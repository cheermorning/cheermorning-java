package com.cheermorning.principle.dependencyinversion;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 依赖倒置原则
 * @date 2021-4-10
 */
public class DependencyInversion {

    public static void main(String[] args) {

        Hisense hisense = new Hisense();
        //第一种方式：直接方法依赖
//        OpenAndClose oac = new OpenAndClose();
//        oac.open(hisense);

        //第二种方式：构造器方法依赖
//        OpenAndClose oac = new OpenAndClose(hisense);
//        oac.open();

        //第三种方式：setter方法依赖
        OpenAndClose oac = new OpenAndClose();
        oac.setTel(hisense);
        oac.open();
    }
}


interface ITelevision{
    void play(String action);
}

class Hisense implements ITelevision{

    public void play(String action) {
        System.out.println("海信电视机, ...." + action);
    }
}

/**
 * 第一种直接方法依赖
 */
//interface ISwitch{
//    void open(ITelevision tel);
//
//    void close(ITelevision tel);
//}
//
//class OpenAndClose implements ISwitch{
//
//    public void open(ITelevision tel) {
//        tel.play("打开");
//    }
//
//    public void close(ITelevision tel) {
//        tel.play("关闭");
//    }
//}

/**
 * 第二种 通过构造器方式依赖
 */
//interface ISwitch{
//    void open();
//}
//
//class OpenAndClose implements ISwitch{
//
//    private ITelevision tel;
//
//    public OpenAndClose(ITelevision tel) {
//        this.tel = tel;
//    }
//    public void open() {
//        this.tel.play("打开");
//    }
//}

/**
 * 第三种：setter方法依赖
 */
interface ISwitch{
    void open();
}

class OpenAndClose implements ISwitch{

    private ITelevision tel;

    public void setTel(ITelevision tel) {
        this.tel = tel;
    }

    public void open() {
        this.tel.play("打开");
    }
}