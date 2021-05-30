package com.cheermorning.mode.behavior.visitor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-25
 */
public class Client {

    public static void main(String[] args) {

        //对象结构
        ObjectStructure os = new ObjectStructure();
        ChineseTeacher teacher = new ChineseTeacher();
        os.attach(teacher);
        os.attach(new MathTeacher());

        //优秀
        Excellent ex = new Excellent();
        os.display(ex);
        System.out.println("================");
        //良好
        Favorable fa = new Favorable();
        os.display(fa);
        System.out.println("================");
        //移除语文，添加英语
        os.detach(teacher);
        os.attach(new EnglishTeacher());

        //及格
        Pass pass = new Pass();
        os.display(pass);
    }
}
