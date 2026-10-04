package com.jessica.javabase.day03;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //三元运算符格式为：条件？表达式1：表达式2
        //如果条件为true，则返回表达式1，否则返回表达式2
        int a =10;
        int b =20;
        int max = a<b?a:b;
        System.out.println(max);
    }
}
