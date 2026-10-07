package com.jessica.javabase.day05;

public class Text31 {
    //求数组里面的最大值
    //求数组里面最小值
    public static void main(String[] args) {
        int[] array = {33, 5, 22, 44, 55};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i]< min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}