package com.jessica.javabase.day04;

import java.util.Scanner;

public class Text24 {
    public static void main(String[] args) {
        /*int i = 1;
        int sum =0;
        for (i=1;i<=5;i++){
            sum = sum +i;
        }
        System.out.println(sum);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int a = scanner.nextInt();
        for (int i=1;a>=2;i++){
            if (i*i==a){
                System.out.println(i+"是"+a+"的平方根");
                break;
            } else if (i*i>a) {
                System.out.println(i-1+"是"+a+"的平方根整数部分");
                break;
            }
        }
    }
}
