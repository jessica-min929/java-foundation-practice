package com.jessica.javabase.day04;

public class Text19 {
    public static void main(String[] args) {
        int a =1234;
        int temp = a;
        int number = 0;
        while (a!=0){
            int ge = a%10;//取个位
            a = a/10;//去个位
            number = number*10+ge;
        }
        System.out.println(number==temp);
    }
}
