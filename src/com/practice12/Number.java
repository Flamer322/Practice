package com.practice12;

public class Number {

    private String number;

    Number(String number){
        if (number.substring(0, 1).equals("8")){
            number = "+7" + number.substring(1, number.length());
        }
        int n = number.length();
        this.number = number.substring(0, n - 7) + "-" + number.substring(n-7, n-4) + "-" + number.substring(n - 4, n);
    }

    public String getNumber(){
        return number;
    }
}
