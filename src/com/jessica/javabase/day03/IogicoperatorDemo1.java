package com.jessica.javabase.day03;

public class IogicoperatorDemo1 {
    public static void main(String[] args) {
        //%运算,全部为真才为真。
        System.out.println(true & true);//结果为真
        System.out.println(true & false);//结果为假
        System.out.println(false & true);//结果为假
        System.out.println(false & false);//结果为假

        System.out.println("-----------------------------------");
        //|运算,全部为假才为假。
        System.out.println(true | true);//结果为真
        System.out.println(true | false);//结果为真
        System.out.println(false | true);//结果为真
        System.out.println(false | false);//结果为假
    }
}
