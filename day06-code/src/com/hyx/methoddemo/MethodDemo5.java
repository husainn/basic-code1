package com.hyx.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        int part1 = getPart(100);
        int part2 = getPart(200);
        int part3 = getPart(300);
        int part4 = getPart(400);
        int result = part1+part2+part3+part4;
        System.out.println(result);
    }

    public static int getPart(int money){
        return money;
    }
}
