package com.hyx.test;

public class Test1 {
    public static void main(String[] args) {
        double price = ticketprice(1000,11,2);
        System.out.println(price);
    }

    public static double ticketprice(int normalprice, int month, int level) {
        double finalyprice;
        if(month>5&&month<10){
            if(level==1){
                finalyprice=normalprice*0.9;
            }else {
                finalyprice=normalprice*0.85;
            }
        } else{
            if(level==1){
                finalyprice=normalprice*0.7;
            }else {
                finalyprice=normalprice*0.65;
            }
        }
        return finalyprice;
    }

}
