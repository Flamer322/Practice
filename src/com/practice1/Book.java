package com.practice1;

public class Book {

    private String name;
    private int pages;

    public Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    public Book(String name){
        this.name = name;
        pages = 150;
    }

    public Book(){
        name = "Unnamed";
        pages = 150;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String toString(){
        return "Name " + this.name + ", pages " + this.pages;
    }

    public void intoTime(){
        System.out.println("The " + this.name + " book's average time to read is " + this.pages / 2 + " minutes");
    }
}
