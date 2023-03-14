package com.hyx.ifdemo;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你选的座位号");
        int number = sc.nextInt();
        //只有当number在0~100之间的才是有效的票
        if (number>=0&&number<=100){
            if (number%2==0){
                System.out.println("坐右侧");
            }else {
                System.out.println("坐左侧");
            }
        }
    }

}
