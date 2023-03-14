package com.hyx.test;

public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i]>max){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
}
