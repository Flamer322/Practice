package com.practice12;

public class ShirtTest {

    public static void main(String[] args){

        String shirts[] = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt shirtss[] = new Shirt[shirts.length];
        for (int i = 0; i < shirts.length; i++){
            shirtss[i] = new Shirt(shirts[i]);
            System.out.println("Shirt №" + (i + 1) + ":\n" + shirtss[i]);
            if (i != shirts.length - 1){
                System.out.println();
            }
        }
    }
}
