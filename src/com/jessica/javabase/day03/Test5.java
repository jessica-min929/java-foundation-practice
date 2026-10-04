package com.jessica.javabase.day03;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的电影票票号：");
        int ticketNumber = scanner.nextInt();
        if(ticketNumber>0 && ticketNumber<=100){
            if(ticketNumber%2!=0){
                System.out.println("坐左边");
            }else{
                System.out.println("坐右边");
            }
        }
    }
}
