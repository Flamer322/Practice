package com.practice8;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args){

        try(FileReader reader = new
                FileReader("src/com/practice8/FileRead.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
