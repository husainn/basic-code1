package com.hyx.skiploop;

public class SkipDemo1 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if (i==3){
                continue;
            }
            System.out.println("小老虎在吃第几个包子"+i);
        }
    }
}
