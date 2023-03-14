package com.hyx.skiploop;

public class SkipDemo2 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if (i==3){
                //break表示跳出整个循环
                break;
            }
            System.out.println("小老虎在吃第几个包子"+i);
        }
    }
}
