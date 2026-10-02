package com.jessica.javabase.day01;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //一行，包含三个整数，依次为输入整数对应的小时数，分钟数和秒数（可能为零），中间用一个空格隔开。
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int hour = time/3600;
        System.out.println(hour);
        int minute = time%3600/60;
        System.out.println(minute);
        int second = time%3600%60;
        System.out.println(second);
    }
}
