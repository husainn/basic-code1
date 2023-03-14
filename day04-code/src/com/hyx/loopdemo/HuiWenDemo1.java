package com.hyx.loopdemo;

import java.util.Scanner;

public class HuiWenDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numbercopy = number;
        int reverse = 0;
        while(number>0){
            int ge = number % 10;
            reverse = reverse*10 + ge;
            number = number/10;
        }
        if (numbercopy==reverse){
            System.out.println("输入的数字是回文数");
        }
        System.out.println(number);
        System.out.println(reverse);
    }
}
