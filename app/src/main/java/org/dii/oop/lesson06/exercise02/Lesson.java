package org.dii.oop.lesson06.exercise02;

import org.dii.oop.lesson06.exercise01.Circle;
import org.dii.oop.lesson06.exercise01.Rectangle;
import org.dii.oop.lesson06.exercise01.Shape;
import org.dii.oop.lesson06.exercise01.Square;

import java.util.Scanner;
import java.util.ArrayList;

public class Lesson {
    public static void run() {

        Scanner in = new Scanner(System.in);
        ResultArray resultArray = new ResultArray();


        do {
            System.out.println("1. Circle\n" +
                    "2. Rectangle\n" +
                    "3. Square\n" +
                    "4. Display all shape\n" +
                    "5. Show summation of area\n" +
                    "6. Exit\n" +
                    "Please select [1-6]:");


            String choice = in.nextLine().trim();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                String strRadius = in.nextLine();

                double douRadius = Double.parseDouble(strRadius);

                Circle circle1 = new Circle( douRadius);
                //store to arrayList
                resultArray.add(circle1);

            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();

                double douHeight = Double.parseDouble(strHeight);
                double douWeight = Double.parseDouble(strWidth);

                Rectangle rectangle1 = new Rectangle(douWeight,douHeight);

                //store to arrayList
                resultArray.add(rectangle1);
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                String strSide = in.nextLine();

                double douSide = Double.parseDouble(strSide);

                Square square1 = new Square(douSide);
                //store to arrayList
                resultArray.add(square1);

            }
            if ("4".equals(choice)) {
                System.out.print("List all shape: ");

                System.out.print(resultArray.listAllShapes());



            }
            if ("5".equals(choice)) {
                System.out.println("Show summation of area "+ resultArray.sumArea());

            }

            if ("6".equals(choice)) {
                break;
            }

        } while(true);

        in.close();
    }
}