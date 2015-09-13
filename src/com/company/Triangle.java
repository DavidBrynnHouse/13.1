package com.company;

public class Triangle extends GeometricObject{
    protected static double side1;
    protected static double side2;
    protected static double side3;

    protected Triangle() {}

    protected Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void displayTriangle(){
        System.out.println();
        System.out.println("The area is " + getArea());
        System.out.println("The perimeter is "+ getPerimeter());
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public double getArea(){
        return (side1 * side2) / 2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
