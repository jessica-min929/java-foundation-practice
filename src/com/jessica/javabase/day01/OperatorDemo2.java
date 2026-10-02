package com.jessica.javabase.day01;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台
        System.out.println("请您输入一个三位数数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num /10%10;
        int bai = num /100;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);

    }

}
