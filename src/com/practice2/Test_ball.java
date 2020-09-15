package com.practice2;

public class Test_ball {
    public static void main(String[] args){
        Ball Ball1 = new Ball(3.0, 3.0);
        Ball Ball2 = new Ball();
        Ball2.move(2.0, 2.0);
        System.out.println(Ball1);
        System.out.println(Ball2);
    }
}
