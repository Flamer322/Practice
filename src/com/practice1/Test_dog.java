package com.practice1;

public class Test_dog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog_a", 3);
        Dog dog2 = new Dog("Dog_b", 7);
        Dog dog3 = new Dog("Dog_c");
        dog3.setAge(4);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
    }
}
