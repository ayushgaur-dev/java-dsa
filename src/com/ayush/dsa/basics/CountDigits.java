package com.ayush.dsa.basics;
import java.util.Scanner;

public class CountDigits {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur number: ");
        long num = in.nextLong();
        int i = 0;
        while(num!=0){
            num = num/10;
            i++;
        }
        System.out.println(i);
    }
}
