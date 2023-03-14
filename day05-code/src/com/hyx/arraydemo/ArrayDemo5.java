package com.hyx.arraydemo;

import java.util.Random;

public class ArrayDemo5 {
    public static void main(String[] args) {
        /*生成10个1~100之间的随机数存入数组
        1、求出所有数据的和
        2、求所有数据的平均数
        3、统计有多少个数据比平均值小*/
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int number = r.nextInt(0,100)+1;
            arr1[i]=number;
        }
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
            sum+=arr1[i];
        }
        System.out.println(sum);
        double avg = sum/10.0;
        System.out.println(avg);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arr1[i]<avg){
                count++;
            }
        }
        System.out.println(count);
        }
    }
