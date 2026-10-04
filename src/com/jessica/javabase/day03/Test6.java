package com.jessica.javabase.day03;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小明的分数：");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
        if (score >= 95 && score <= 100) {
            System.out.println("送自行车一辆");
        } else if (score >= 90 & score <= 94) {
            System.out.println("游乐场玩一天");
        } else if (score >= 80 & score <= 89) {
            System.out.println("送变形金刚一个");
        } else {
            System.out.println("送学习资料一套");
        }
    } else {
        System.out.println("输入的分数有误");
    }
}
}
