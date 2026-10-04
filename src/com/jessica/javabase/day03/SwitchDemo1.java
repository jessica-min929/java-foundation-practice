package com.jessica.javabase.day03;

public class SwitchDemo1 {
    public static void main(String[] args) {
        String noodles = "兰州拉面";
        switch(noodles){
            case"兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
            case"北京炸酱面":
                System.out.println("吃北京炸酱面");
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
