package com.practice5;

public class task7 {

    public static void factors(int a, int d){
        if (d > a / 2){
            System.out.println(a);
        } else {
            if (a % d == 0){
                System.out.println(d);
                factors(a / d, 2);
            } else {
                factors(a, d + 1);
            }
        }
    }

    public static void main(String[] args){
        factors(78, 2);
    }
}
