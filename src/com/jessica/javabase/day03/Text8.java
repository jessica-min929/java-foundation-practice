package com.jessica.javabase.day03;

public class Text8 {
    public static void main(String[] args) {
        boolean isLightRed = false;
        boolean isLightYellow = false;
        boolean isLightGreen = true;
        if(isLightRed){
            System.out.println("Stop");
        } else if (isLightYellow) {
            System.out.println("Wait");
        } else if (isLightGreen) {
            System.out.println("Go");
        }
    }
}
