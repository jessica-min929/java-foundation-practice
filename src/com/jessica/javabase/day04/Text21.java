package com.jessica.javabase.day04;

public class Text21 {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i%10==7||i%10/10==7||i%7==0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}