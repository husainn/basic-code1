package com.hyx.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        getSum(12,23);
        getArea(1.5);
    }

    public static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void getArea(double radius) {
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}
