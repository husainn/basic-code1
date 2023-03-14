package com.hyx.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= num; i++) {
            int x = num % i;
            if(x==0){
                j++;
            }
        }
        if(j==2){
            System.out.println("数字"+num+"是质数");
        }else {
            System.out.println("数字"+num+"不是质数");
        }
    }
}
