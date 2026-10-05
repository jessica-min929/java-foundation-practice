package com.jessica.javabase.day04;

import java.util.Random;
import java.util.Scanner;

public class Text26 {
    public static void main(String[] args) {
        int count =0;
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int guess = scanner.nextInt();
            count++;
            if (count==3){
                System.out.println("对了");
                break;
            }
            if (guess == number) {
                System.out.println("对了");
                break;
            } else if (guess < number) {
                System.out.println("小了");
            } else if (guess > number) {
                System.out.println("大了");
            }
        }
    }
}