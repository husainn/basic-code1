package com.hyx.ifdemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入身上的钱");
        int a = sc.nextInt();
        if (a>100){
            System.out.println("进网红餐厅");
        }else {
            System.out.println("去沙县小吃");
        }
    }
}
