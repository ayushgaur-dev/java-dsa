package com.ayush.dsa.arrays;
import java.util.Scanner;
public class ReverseOfArray {
    static void main(String[] args) {
        //input
        System.out.println("Enter array size: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] numbers = new int[n];

        System.out.printf("Enter array values upto %d values: ", n);
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        System.out.println("here is ur reverse array");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}



