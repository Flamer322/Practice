package com.practice3;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 0.0;
        this.length = 0.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (int)(this.width * this.length);
    }

    @Override
    public double getPerimeter() {
        return (int)(2 * this.width + 2 * this.length);
    }

    @Override
    public String toString() {
        return "Rectangle, Width = " + this.width + ", Length = " + this.length;
    }
}
