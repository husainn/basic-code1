package com.hyx.test;

public class Test2 {
    public static void main(String[] args) {
        //设计一个方法,求数组的最大值，并将最大值返回
        int[] arr1 = {11,22,33,44,55};
        System.out.println(getMax(arr1));

    }

    public static int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}
