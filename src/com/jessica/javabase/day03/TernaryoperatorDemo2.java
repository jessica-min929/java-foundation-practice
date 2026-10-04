package com.jessica.javabase.day03;

import java.util.Scanner;

public class TernaryoperatorDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        double weight1= scanner.nextDouble();
        System.out.println("请输入第二只老虎的体重：");
        double weight2 = scanner.nextDouble();
        System.out.println(weight1==weight2? "相同":"不同");

    }
}
