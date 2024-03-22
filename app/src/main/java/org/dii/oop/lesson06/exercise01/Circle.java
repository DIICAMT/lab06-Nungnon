package org.dii.oop.lesson06.exercise01;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle", 0);
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

}