package com.jessica.javabase.day04;

import java.util.Scanner;

public class Text25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        boolean flag = true;// 假设输入的数是质数
        int a = scanner.nextInt();
        for (int i =2;i<a;i++){
            if (a % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(a+"是质数");
        }else {
            System.out.println(a+"不是质数");
        }
    }
}
