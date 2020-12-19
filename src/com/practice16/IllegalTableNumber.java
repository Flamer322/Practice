package com.practice16;

public class IllegalTableNumber extends Throwable{
    public String Error(){
        return "Столика с таким номером не существует!";
    }
}