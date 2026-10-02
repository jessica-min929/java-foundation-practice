package com.jessica.javabase.day01;

import java.util.Scanner;

public class VariableDemo6 {
    //键盘录入：
    //第一步找到Scanner这一个打工人
    //第二步让Scanner干活
    public static void main(String[] args) {
        //1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);
      /*  //接受键盘录入的整数
        int a = sc.nextInt();
        System.out.println(a);
        //接受键盘录入的小数*/
       /* double b = sc.nextDouble();
        System.out.println(b);*/
        //接收键盘录入的文本（字符串）
        String c = sc.next();
        System.out.println(c);
    }
}
