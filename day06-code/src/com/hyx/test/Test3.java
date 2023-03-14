package com.hyx.test;

public class Test3 {
    public static void main(String[] args) {
        //设计一个方法,求数组的最大值，并将最大值返回
        int[] arr1 = {11,22,33,44,55};
        int a = 22;
        System.out.println(isContain(a,arr1));
    }

    public static boolean isContain(int a,int[] arr){
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a){
                result = true;
            }
        }
        return result;
    }
}
