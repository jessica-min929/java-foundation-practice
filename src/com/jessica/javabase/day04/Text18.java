package com.jessica.javabase.day04;

public class Text18 {
    public static void main(String[] args) {
        double zhumuheight = 8844430;
        double paper = 0.1;
        int count=0;
        while (paper<zhumuheight){
            paper=paper*2;
            count++;
        }
        System.out.println(count);
    }
}