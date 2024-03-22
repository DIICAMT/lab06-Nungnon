package org.dii.oop.lesson06.exercise02;

import org.dii.oop.lesson06.exercise01.Shape;
import org.dii.oop.lesson06.exercise01.Shape;
import java.util.ArrayList;


public class ResultArray extends ArrayList<Shape> {




    public ResultArray(){

    }

    public boolean listAllShapes(){

        for (Shape shape : this) {

            int num_side = 0;

            if (shape.getClass().getSimpleName().equals("Circle")){
                num_side = 0;
            }
            else {
                num_side = 4;
            }

            System.out.println(
                    "Name: " + shape.getClass().getSimpleName() +
                            ", Number of sides: " + num_side +
                            ", Area: " + shape.getArea() +
                            ", Perimeter: " + shape.getPerimeter()
            );
        }

        return false;
    }

    public double sumArea(){

        double sum = 0;

        for (Shape shape : this) {
            sum += shape.getArea();
        }

        return sum;
    }
}