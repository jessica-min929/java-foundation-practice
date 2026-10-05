package com.jessica.javabase.day04;

public class Text20 {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int count =0;
        while (a>=b){
            a=a-b;
            count++;
        }
        System.out.println("余数为:"+a);//得到的是余数
        System.out.println("商为:"+count);//得到的是商
    }
}
