package com.ayush.dsa.funtionsandmethods;

import java.util.Scanner;

public class SumOfTwoNumbers {
    static void main(String[] args) {
        int ans = Sum(662,55);
        System.out.println(ans);

    }
    static int Sum(int a, int b){
        Scanner in = new Scanner(System.in);
        int sum = a+b;
        return sum;
    }
}
