package com.practice8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyApp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        try(FileWriter writer = new
                FileWriter("src/com/practice8/KeyWrite.txt", true))
        {
            writer.write("\n");
            writer.write(inp);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}