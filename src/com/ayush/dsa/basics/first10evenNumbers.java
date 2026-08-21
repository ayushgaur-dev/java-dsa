package com.ayush.dsa.basics;

public class first10evenNumbers {
    static void main(String[] args) {
        int sum = 0;


        for(int i = 0; i<=10; i++){
            int num = 2*i;
            sum = sum + num;

        }
        System.out.println(sum);
    }
}
