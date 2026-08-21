package com.ayush.dsa.basics;
import java.util.Scanner;

public class TableOfNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter ur number: ");
        int num = in.nextInt();

        for(int i=1; i<=10; i++){
            int multiply = num*i;
            System.out.println(num + "*" + i + "=" + multiply);
        }
    }
}
