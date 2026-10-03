package com.jessica.javabase.day02;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入我的时髦度：");
        int myFashion = scanner.nextInt();
        System.out.println("我约会对象的时髦度：");
        int myDate = scanner.nextInt();
        System.out.println(myFashion>myDate);

    }
}
