package com.jessica.javabase.day03;

import java.util.Scanner;

public class Text10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("工作日");
                break;
            case 2 :
                System.out.println("工作日");
                break;
            case 3 :
                System.out.println("工作日");
                break;
            case 4 :
                System.out.println("工作日");
                break;
            case 5 :
                System.out.println("工作日");
                break;
            case  6 :
                System.out.println("休息日");
                break;
            case 7 :
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
