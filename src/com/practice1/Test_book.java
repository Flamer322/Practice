package com.practice1;

public class Test_book {
    public static void main(String[] args) {
        Book Book1 = new Book("Physics", 300);
        Book Book2 = new Book("mathematics", 400);
        Book Book3 = new Book("English");
        Book3.setPages(250);
        System.out.println(Book1);
        Book1.intoTime();
        Book2.intoTime();
        Book3.intoTime();
    }
}
