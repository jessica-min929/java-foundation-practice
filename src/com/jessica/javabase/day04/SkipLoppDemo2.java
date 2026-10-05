package com.jessica.javabase.day04;

public class SkipLoppDemo2 {
    public static void main(String[] args) {
        int i = 1;
        for (i=1;i<=5;i++){
            System.out.println("吃第"+i+"面包");
            if (i==3){
                break;
            }
        }
    }
}
