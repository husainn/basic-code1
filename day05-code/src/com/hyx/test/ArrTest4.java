 package com.hyx.test;

 import java.util.Random;

 public class ArrTest4 {
    public static void main(String[] args) {
        /*
        定义一个数组，存入1，2,3,4,5，随机交换元素
        */
        int[] arr1 = {1,2,3,4,5,6,7};
        for (int i = 0;i < arr1.length-1; i++) {
            int x = arr1[i];
            Random r = new Random();
            int j = r.nextInt(i+1, arr1.length);
            arr1[i]=arr1[j];
            arr1[j]=x;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
