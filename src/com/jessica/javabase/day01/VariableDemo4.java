package com.jessica.javabase.day01;

public class VariableDemo4 {
    /*
	定义8种数据类型的变量：

	整数类型：byte、short、int、long
	浮点数类型：float、double
	字符类型：char
	布尔类型：boolean

	变量的定义格式：
		数据类型 变量名 = 数据值;
*/
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        float f = 12F;
        double g = 13;
        System.out.println(f);
        System.out.println(g);
        char h ='A';
        System.out.println(h);
        boolean i = true;
        System.out.println(i);
    }

}
