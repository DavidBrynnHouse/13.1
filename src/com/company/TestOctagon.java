package com.company;

/**
 * Created by David on 9/14/2015.
 */
public class TestOctagon implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct1 = new Octagon(5);
        Octagon oct2 = (Octagon) oct1.clone();

        System.out.println("The Area is " + oct1.getArea() +
                "The Perimeter is " + oct1.getPerimeter());

        System.out.println(oct1.compareTo(oct2));

    }
}
