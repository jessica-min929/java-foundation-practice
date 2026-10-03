package com.jessica.javabase.day02;

public class OperatorDemo5 {
    public static void main(String[] args) {
        byte a = 100;
        short b = 200;
        double c = 20.3;
        //首先a+b，结果是int
        //然后int+c，结果是double
        //这是从小到大，隐式转化。顺序是byte short int long float double

        double result =(double)( a + b + c);
        System.out.println(result);
    }
}
