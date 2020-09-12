package com.practice2;

public class Test_author {
    public static void main(String[] args) {
        Author Author1 = new Author("Petr Petrov", "pp@p.ppp", 'M');
        Author Author2 = new Author("Vera Verovna", "__@_.___", 'F');
        Author2.setEmail("vv@v.vvv");
        System.out.println(Author1);
        System.out.println(Author2);
    }
}
