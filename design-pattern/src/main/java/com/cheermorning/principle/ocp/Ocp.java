package com.cheermorning.principle.ocp;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 开闭原则
 * @date 2021-4-11
 */
public class Ocp {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.drawShape(new Rectangle());
        draw.drawShape(new Circle());
        draw.drawShape(new Triangle());

    }
}

class Draw{
    public void drawShape(Shape s){
        if(s.type == 1){
            drawRectangle();
        }else if(s.type == 2){
            drawCircle();
        }else if(s.type == 3){
            drawTriangle();
        }
    }

    public void drawRectangle(){
        System.out.println(" 绘制矩形 ");
    }

    public void drawCircle(){
        System.out.println(" 绘制圆形 ");
    }
    public void drawTriangle(){
        System.out.println(" 绘制三角形 ");
    }
}

//图形接口
class Shape{
    int type;
}

class Rectangle extends Shape{
    public Rectangle() {
        super.type= 1;
    }
}

class Circle extends Shape{
    public Circle() {
        super.type= 2;
    }
}

class Triangle extends Shape{
    public Triangle() {
        super.type= 3;
    }
}

