 package com.hyx.test;

public class ArrTest3 {
    public static void main(String[] args) {
        /*
        定义一个数组，存入1，2,3,4,5，交换收尾索引对应的元素，
        交换前，1，2,3,4,5
        交换后，5，4,3,2,1
        */
        int[] arr1 = {1,2,3,4,5,6,7};
        for (int i = 0,j = arr1.length-1;i < j; i++,j--) {
            int x = arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=x;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
