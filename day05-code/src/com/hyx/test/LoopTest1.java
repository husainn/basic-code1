package com.hyx.test;

public class LoopTest1 {
    public static void main(String[] args) {
        //逢7过
        for (int i =1;i<=100;i++){
            if (i%7==0 || i/10==7 ||i%10==7){
                continue;
            }
            System.out.println("数字是"+i);
        }
    }
}
