package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    public double left=0, top=0, width=0, height=0;

    public Rectangle(double left,double top, double width){
        this.height=width;
        this.left=left;
        this.top=top;
        this.width=width;
    }
    public Rectangle(double left,double top, double width,double height){
        this.height=height;
        this.left=left;
        this.top=top;
        this.width=width;
    }
    public Rectangle(double left,double top){
        this.height=0;
        this.left=left;
        this.top=top;
        this.width=0;
    }
    public Rectangle(Rectangle shape){
        this.height=shape.height;
        this.left=shape.left;
        this.top=shape.top;
        this.width=shape.width;
    }

}
