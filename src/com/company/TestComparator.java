package com.company;

/**
 * Created by David on 9/13/2015.
 */
public class TestComparator {
    public static void main(String[] args) {
        GeometricObjectComparator comp = new GeometricObjectComparator();

        GeometricObject rect1 = new Rectangle(2.3, 4.5);
        GeometricObject rect2 = new Rectangle(4.7, 5.9);
        GeometricObject circ1 = new Circle(3.6);
        GeometricObject circ2 = new Circle(5.6);

        System.out.println("The largest rectangle is " + comp.max(rect1, rect2));
        System.out.println("The largest circle is " + comp.max(circ1, circ2));

    }
}
