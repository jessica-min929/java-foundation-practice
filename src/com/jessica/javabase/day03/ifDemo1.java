package com.jessica.javabase.day03;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = scanner.nextInt();
        if (wine > 2){
            System.out.println("通关");
        }
    }
}
