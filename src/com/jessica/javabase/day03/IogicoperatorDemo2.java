package com.jessica.javabase.day03;

public class IogicoperatorDemo2 {
    public static void main(String[] args){
        //^  这一个叫做异或运算，也就是不同才为真。
        System.out.println(1^1);//结果为假
        System.out.println(1^0);//结果为真
        System.out.println(0^1);//结果为真
        System.out.println(0^0);//结果为假



        System.out.println("--------------------");
        //！这个叫做取反运算，也就是true的就变成false，false的就变成true。
        //提示！要么只写一次，要么不写。
        System.out.println(!true);//结果为假
        System.out.println(!false);//结果为真
    }

}
