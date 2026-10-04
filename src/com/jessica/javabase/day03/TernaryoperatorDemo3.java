package com.jessica.javabase.day03;

public class TernaryoperatorDemo3 {
    public static void main(String[] args) {
        int a = 150;
        int b = 210;
        int c = 165;
        int weight1 = a>b?a:b;
        /*System.out.println(weight1);*/
        int weightMax = weight1>c?weight1:c;
        System.out.println("该三个人中最高身高是:"+weightMax+"cm");
    }
}
