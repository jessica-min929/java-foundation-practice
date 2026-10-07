package com.jessica.javabase.day05;

import java.util.Random;
import java.util.Scanner;

public class Text27 {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字:");
            int guessNumber = scanner.nextInt();
            count++;
            if (count == 3){
                System.out.println("对了！");
                break;
            }
            if (guessNumber == number) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guessNumber > number) {
                System.out.println("大了！");
            } else if (guessNumber < number) {
                System.out.println("小了！");
            }
        }
    }
}