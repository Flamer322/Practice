package com.practice12;

public class NumberTest {

    public static void main(String[] args){

        Number number1 = new Number("89175655655");
        System.out.println(number1.getNumber());
        Number number2 = new Number("+79175655655");
        System.out.println(number2.getNumber());
    }
}
