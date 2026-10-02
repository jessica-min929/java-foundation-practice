package com.jessica.javabase.day01;

public class VariableDemo1 {
    /*微信余额：0元
      支付宝余额：10元
      银行卡余额：20元
      问题一：请问现在一共有多少钱？
      问题二：微信收了10元红包，又发了2元红包，余额多少？*/
    public static void main(String[] args) {
        double a = 0;//微信余额为0元
        double b = 10;//支付宝余额10元
        double c = 20;//银行卡余额20元
        System.out.println(a+b+c);
        a = a + 10;//微信收了10元红包
        a = a - 2;//微信发了2元红包
        System.out.println(a);
    }
}
