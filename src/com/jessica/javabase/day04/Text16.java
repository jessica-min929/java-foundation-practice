package com.jessica.javabase.day04;

public class Text16 {
    public static void main(String[] args) {
        int sum =0;
        for (int a = 0; a<=100; a++){
            if (a%2==0){
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}
