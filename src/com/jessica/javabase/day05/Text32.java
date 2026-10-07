package com.jessica.javabase.day05;

import java.util.Random;
//求和并统计数据

public class Text32 {
    public static void main(String[] args) {
        int [] array = new int[10];
        Random random = new Random();




        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(100)+1;
            array[i] = number;
            System.out.println(array[i]);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];
        }
        System.out.println(sum);

        double avg = 0.0;
        avg = sum/10.0;
        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<avg){
                count ++;
        }
        }
        System.out.println(count);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +"  ");
        }
    }
}
