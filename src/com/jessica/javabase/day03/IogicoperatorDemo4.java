package com.jessica.javabase.day03;

import java.util.Scanner;

public class IogicoperatorDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = A + B;
        System.out.println(A ==6 || B==6 || result%6==0);
    }
}
