package com.practice12;

public class Shirt {

    private String shirt[];

    Shirt(String shirt){
        this.shirt = shirt.split(",");
    }

    @Override
    public String toString(){
        return "Serial number: " + shirt[0] +
                "\nName: " + shirt[1] +
                "\nColor: " + shirt[2] +
                "\nSize: " + shirt[3];
    }
}
