package org.dii.oop.lesson06.exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson {

    private static ArrayList<Shape> shapes = new ArrayList<>();
    public static void run() {

        //HINT1: usage arraylist with Shape class to store all of your shapes, check how to use arrayList by yourself

        //HINT2: you may want to declare your arrayList around here

        Scanner in = new Scanner(System.in);


        do {
            System.out.println("1. Circle\n" +
                    "2. Rectangle\n" +
                    "3. Square\n" +
                    "4. Display all shape\n" +
                    "5. exit" );
            System.out.print("Please select [1-5]: ");
            //print menu as instructed in MD file
            String choice = in.nextLine().trim();
            System.out.println("");




            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                double radius = Double.parseDouble(in.nextLine());
                shapes.add(new Circle(radius));
                //store to arrayList
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                double width = Double.parseDouble(in.nextLine());
                System.out.print("Enter height: ");
                double height = Double.parseDouble(in.nextLine());
                shapes.add(new Rectangle(width, height));

                //store to arrayList
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                double side = Double.parseDouble(in.nextLine());
                shapes.add(new Square(side));

                //store to arrayList
            }
            if ("4".equals(choice)) {
                System.out.print("List all shape: ");
                for (Shape shape : shapes) {
                    // Displaying the details of each shape
                    System.out.println("Name: " + shape.getName() +
                            ", Number of side: " + shape.getNumSide() +
                            ", Area: " + String.format("%.2f", shape.getArea()) +
                            ", Perimeter: " + String.format("%.2f", shape.getPerimeter()));
                }
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if ("5".equals(choice)) {
                break;
            }

        } while(true);

        in.close();
    }
}