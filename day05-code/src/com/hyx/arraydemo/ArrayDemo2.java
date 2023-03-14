package com.hyx.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //int数组，直接打印是一个地址[I@776ec8df
        int[] a= new int[]{1,2,3};
        int[] a1 = {1,2,3,4,5};
        System.out.println(a1[0]);
        //string数组,[Ljava.lang.String;@4eec7777
        String[] arr2 = {"卡塔尔","阿根廷","荷兰"};
        System.out.println(arr2[1]);
        //double数组,[D@3b07d329
        double[] arr3 = {1.1,1.2,1.3};
        System.out.println(arr3[2]);
    }
}
