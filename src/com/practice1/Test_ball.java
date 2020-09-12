package com.practice1;

public class Test_ball {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red", 5);
        Ball ball2 = new Ball("green", 10);
        Ball ball3 = new Ball("blue");
        ball3.setRadius(15);
        System.out.println(ball1);
        ball1.intoVolume();
        ball2.intoVolume();
        ball3.intoVolume();
    }
}
