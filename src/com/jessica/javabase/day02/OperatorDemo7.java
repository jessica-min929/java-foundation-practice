package com.jessica.javabase.day02;

public class OperatorDemo7 {
    public static void main(String[] args) {
    int a = 10;
    int b = a++;
    System.out.println(a);
    System.out.println(b);


    int c = 12;
    int d = ++c;
    System.out.println(c);
    System.out.println(d);

    int x = 10;
    int y = x++;
    int z = ++x;
    System.out.println("X是:" + x);
    System.out.println("y是:" + y);
    System.out.println("z是:" + z);
    }
}
