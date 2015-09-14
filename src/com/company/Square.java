package com.company;

/**
 * Created by David on 9/14/2015.
 */
public class Square extends GeometricObject implements Colorable {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
