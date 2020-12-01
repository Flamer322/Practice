package com.practice12;

public class AddressTest {

    public static void main(String[] args){

        Address address1 = new Address("Россия Москва Москва Вернадского 86 1 520");
        System.out.println(address1.getAddress());
        Address address2 = new Address("Российская Федерация,Москва,Москва,проспект Вернадского,86,1,520", ",");
        System.out.println(address2.getAddress());
        Address address3 = new Address("Российская Федерация.Москва.Москва.проспект Вернадского.86.1.520", "\\.");
        System.out.println(address3.getAddress());
        Address address4 = new Address("Российская Федерация;Москва;Москва;проспект Вернадского;86;1;520", ";");
        System.out.println(address4.getAddress());
    }
}
