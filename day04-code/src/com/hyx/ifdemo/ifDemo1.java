package com.hyx.ifdemo;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        //需求，键盘录入女婿的酒量，如果大于2斤，老丈人给出回应，反之不回应

        //if格式
        //if(关系表达式){
            //语句体：
        // }


        //分析：
        //键盘录入酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int a = sc.nextInt();
        if (a>2){
            System.out.println("给出回应");
        }else {
            System.out.println("酒量不够");
        }
    }
}
