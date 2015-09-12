package com.company;

import java.util.Scanner;

public class TestTriangle extends Triangle{

    public static void main(String[] args) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        Scanner scanBoolean = new Scanner(System.in);
        GeometricObject geog = new Triangle();

        System.out.println("Enter the sides of the right triangle, first the base then the sides: ");
        geog.side1 = scanDouble.nextDouble();
        geog.side2 = scanDouble.nextDouble();
        geog.side3 = scanDouble.nextDouble();

        System.out.println("What color is the triangle?");
        geog.color = scanString.nextLine();

        System.out.println("Is the Triangle filled in? (Y/N)");
        if(scanBoolean.nextBoolean().equalsIgnoreCase("Y"))
            geog.filled = true;
        else
            geog.filled = false;

        displayTriangle(geog);
    }
}