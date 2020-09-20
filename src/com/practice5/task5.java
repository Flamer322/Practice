package com.practice5;

public class task5 {

    static int sum(int a) {
        if (a < 10) {
            return a;
        } else {
            return a % 10 + sum(a / 10);
        }
    }

    public static void main(String[] args){
        int N = 123;
        System.out.println(sum(N));
    }
}
