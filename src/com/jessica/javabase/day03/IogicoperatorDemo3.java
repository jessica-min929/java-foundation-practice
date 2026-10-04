package com.jessica.javabase.day03;

public class IogicoperatorDemo3 {
    public static void main(String[] args) {
        //短路与&& 如果前面为假，则后面不再运行，直接出结果，提高了代码的运行效率。
        //运算的思路还是一样的和&运算符一样，只是短路与&&在前面为假时，后面不再运行，提高了代码的运行效率。
        System.out.println(true && true);//结果为真
        System.out.println(false && true);//结果为假
        System.out.println(true && false);//结果为假
        System.out.println(false && false);//结果为假

        int a = 10;
        int b = 20;
        a++;//结果为11
        b++;//结果为21
        boolean result = 11 < a++ && b++ <15;
        System.out.println(result);
    }
}
