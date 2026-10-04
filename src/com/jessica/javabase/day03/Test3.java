package com.jessica.javabase.day03;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入现在身上的钱：");
        int money = scanner.nextInt();
        if(money>=100){
            System.out.println("去吃网红餐厅");
        }else{
            System.out.println("去吃沙县小吃");
        }
    }
}
