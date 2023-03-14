 package com.hyx.test;

 import java.util.Random;

 public class ArrTest5 {
    public static void main(String[] args) {
        /*
        定义一个数组，存入1,2,3,4,5，随机交换元素
        */
        int[] arr1 = {1,2,3,4,5,6,7};
        Random r = new Random();
        for (int i = 0;i < arr1.length; i++) {
            int x = arr1[i];
            int j = r.nextInt(arr1.length);
            arr1[i]=arr1[j];
            arr1[j]=x;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
