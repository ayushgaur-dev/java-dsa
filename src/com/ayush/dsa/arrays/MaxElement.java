package com.ayush.dsa.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    static void main(String[] args) {
        // find max element
        Scanner in = new Scanner(System.in);
        System.out.println("enter array size");
        int n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i< array.length;i++){
            array[i] = in.nextInt();
        }

        int max = array[0];


        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i< array.length;i++){
            if(max<array[i]){
                max = array[i];
            }

        }
        System.out.printf("Largest element is: %d", max);
    }
}


