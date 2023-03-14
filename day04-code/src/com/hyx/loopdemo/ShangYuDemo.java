package com.hyx.loopdemo;

public class ShangYuDemo {
    public static void main(String[] args) {
        int i = 100;
        int j = 15;
        int x = j;
        int result = 0;
        while (x<=i){
            x+=j;
            result++;
        }
        int yu = i+j-x;
        System.out.println(result);
        System.out.println(yu);
    }
}
