package com.jessica.javabase.day03;

import java.util.Scanner;

public class Text7 {
    public static void main(String[] args) {
        int totalPrice = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的会员级别：");
        int memberLevel = scanner.nextInt();
        if(memberLevel ==1){
            System.out.println("打九折，折后是"+totalPrice*0.9+"元");
        }else if(memberLevel ==2){
            System.out.println("打八折，折后是"+totalPrice*0.8+"元");
        }else if (memberLevel ==3){
            System.out.println("打七折，折后是"+totalPrice*0.7+"元");
        }else {
            System.out.println("不打折");
        }
    }
}
