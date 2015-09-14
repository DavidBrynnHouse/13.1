package com.company;

/**
 * Created by David on 9/14/2015.
 */
public class Octagon extends GeometricObject implements Comparable, Cloneable {
    protected double side;

    public Octagon() {}

    public Octagon(double side){
        super();
        this.side = side;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }
}
