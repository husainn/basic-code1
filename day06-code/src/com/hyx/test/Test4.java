package com.hyx.test;

public class Test4 {
    public static void main(String[] args) {
        //定义一个方法copyOfRange(int[] arr,int from,into to)
        /*将数组arr中从索引from（包含from）开始。
        到索引to结束（不包含to）的元素复制到新数组中
        将新数组返回
        */
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = copyOfRange(arr,2,6);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

    }

    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] arr1 = new int[to-from];
        int j=0;
        for (int i = from; i <to ; i++) {
            arr1[j]=arr[i];
            j++;
        }
        return arr1;
    }
}
