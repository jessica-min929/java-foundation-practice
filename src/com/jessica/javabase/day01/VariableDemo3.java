package com.jessica.javabase.day01;

public class VariableDemo3 {
    /*
	变量的注意事项：
	1. 只能存一个值
	2. 变量名不允许重复定义
	3. 变量在使用之前一定要进行赋值
	4. 一条语句可以定义多个变量，也可以连续赋值
*/
public static void main(String[] args) {
   /* int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);*/
    int a , b, c, d;
    a = b = c = d =20;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

}
}
