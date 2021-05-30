package com.cheermorning.principle.ocp.improve;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 开闭原则
 * @date 2021-4-11
 */
public class OcpImprove {

    public static void main(String[] args) {
        Draw draw = new Draw();
        draw.drawShape(new Rectangle());
        draw.drawShape(new Circle());
        draw.drawShape(new Triangle());
        draw.drawShape(new Rhombus());

    }
}

class Draw {
    public void drawShape(Shape s) {

        s.draw();
    }

}
/**
 *
 图形接口
 */
abstract class Shape{
    int type;

  public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type= 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    public Circle() {
        super.type= 2;
    }

    @Override
   public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle extends Shape {
    public Triangle() {
        super.type= 3;
    }

    @Override
   public void draw() {
        System.out.println("绘制三角形");
    }
}

class Rhombus extends Shape{

    public Rhombus(){
        super.type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制凌形");
    }
}

