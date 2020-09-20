package com.practice5;


public class task8 {

    public static boolean pal(String s) {
        if (s.length() < 2) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return pal(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String s = "QQWQWQQ";
        System.out.println(pal(s));
    }
}