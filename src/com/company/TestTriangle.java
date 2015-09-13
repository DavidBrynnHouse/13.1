package com.company;

import java.util.Scanner;

public class TestTriangle extends Triangle{

    public static void main(String[] args) {
        Scanner scanDouble = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
        Scanner scanBoolean = new Scanner(System.in);
        Triangle tri = new Triangle();

        System.out.println("Enter the sides of the right triangle, first the base then the sides: ");
        tri.setSide1(scanDouble.nextDouble());
        tri.setSide2(scanDouble.nextDouble());
        tri.setSide3(scanDouble.nextDouble());

        System.out.println("What color is the triangle?");
        tri.setColor(scanString.nextLine());

        System.out.println("Is the Triangle filled in? (Y/N)");
        if(scanBoolean.nextLine().equalsIgnoreCase("Y"))
            tri.setFilled(true);
        else
            tri.setFilled(false);

        tri.displayTriangle();
    }
}