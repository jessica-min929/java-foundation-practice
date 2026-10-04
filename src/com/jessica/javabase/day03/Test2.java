package com.jessica.javabase.day03;

public class Test2 {
    public static void main(String[] args) {
        boolean isLightRed = false;
        boolean isLightYellow = false;
        boolean isLightGreen = true;
        if (isLightRed){
            System.out.println("Stop");
        }
        if (isLightYellow){
            System.out.println("Wait");
        }
        if (isLightGreen){
            System.out.println("Go");
        }
    }
}
