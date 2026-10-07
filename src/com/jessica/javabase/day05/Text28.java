package com.jessica.javabase.day05;

public class Text28 {
    public static void main(String[] args) {
        int sum = 0;
        int [] array ={1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum = sum +array[i];
        }
        System.out.println(sum);
    }
}
