package com.ayush.dsa.basics;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur number: ");
        int num = in.nextInt();
        int rem ;
        int sum = 0;
        int temp = num;
        int initial_num = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        while(num!=0){
            rem = num%10;
            num = num/10;
            sum = sum + (int) Math.pow(rem, digits);

        }
        if(sum==initial_num){
            System.out.printf("The given number %d is an armstrong number because the sum of it's digits cube is also %d ", initial_num, sum);
        }
        else{
            System.out.printf("The given number %d is not an armstrong number because the cube of its digits sum is %d", initial_num, sum);
        }
    }
}
