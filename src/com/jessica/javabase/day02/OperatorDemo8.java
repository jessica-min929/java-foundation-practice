package com.jessica.javabase.day02;

public class OperatorDemo8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a+=b;
        System.out.println(a);
        System.out.println(b);


        short c = 10;
        c+=2;//注意这里有一个小细节就是c是short类型，所以c+=2等价于c=(short)(c+2)。为什么是short?因为c是short类型，所以c+2的结果是int类型，所以需要强制转换成short类型。
        System.out.println(c);
    }
}
