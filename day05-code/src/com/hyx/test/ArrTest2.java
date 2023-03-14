package com.hyx.test;

public class ArrTest2 {
    public static void main(String[] args) {
        /*
        定义一个数组，存入1，2,3,4,5，交换收尾索引对应的元素，
        交换前，1，2,3,4,5
        交换后，5，2,3,4,1
        */
        int[] arr1 = {1,2,3,4,5};
        int x = arr1[0];
        arr1[0]=arr1[4];
        arr1[4]=x;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]);
        }
    }
}
