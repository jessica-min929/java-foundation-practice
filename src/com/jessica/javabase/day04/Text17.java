package com.jessica.javabase.day04;

import java.util.Scanner;

public class Text17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个取值范围的数字：");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个取值范围的数字：");
        int number2 = scanner.nextInt();
        int count = 0;//统计变量，统计符合要求的数字个数。
        for (int i = number1; i <= number2; i++){
            if (i%3==0&&i%5==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
