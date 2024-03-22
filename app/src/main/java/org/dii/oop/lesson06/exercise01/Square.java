package org.dii.oop.lesson06.exercise01;

public class Square extends Shape{

    private double side;

    public Square(double side){
        super("Square", 4);
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return side*4;
    }
}