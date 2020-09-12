package com.practice1;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Ball {

    private String color;
    private int radius;

    public Ball(String color, int radius){
        this.color = color;
        this.radius = radius;
    }

    public Ball(String color){
        this.color = color;
        radius = 5;
    }

    public Ball(){
        color = "unclear";
        radius = 5;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color){
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString(){
        return "Color "+this.color+", radius "+this.radius;
    }

    public void intoVolume(){
        System.out.println("The " + this.color + " ball's volume is " + (int)(pow(this.radius, 3) * PI * 4 / 3) + " cm^3");
    }
}
