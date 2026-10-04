package com.jessica.javabase.day03;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int totalMoney = 600;
        Scanner scanner = new Scanner(System.in);
        System.out.println("用户实际支付的钱:");
        int payMoney = scanner.nextInt();
        if (payMoney>=600){
            System.out.println("用户支付成功");
        }else {
            System.out.println("用户支付失败");
        }
    }
}