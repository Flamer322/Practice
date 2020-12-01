package com.practice12;

public class PersonTest {

    public  static void main(String[] args){

        Person person = new Person("Bartenev Boris Konstantinovich");
        System.out.println(person.getFio());
        person.setFio("Kulagin Ivan Antonovich");
        System.out.println(person.getFio());
    }
}
