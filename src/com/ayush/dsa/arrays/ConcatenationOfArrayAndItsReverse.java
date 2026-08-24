package com.ayush.dsa.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ConcatenationOfArrayAndItsReverse {
    static void main(String[] args) {
        System.out.println("Enter ur array size: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("enter ur array: ");
        int[] array = new int[n];

        for (int i =0; i< array.length; i++){
            array[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(array));

        // new array for double size
        int[] new_array = new int[2*n];
        int j =0;

        for (int i = 0; i< array.length; i++){
            new_array[j] = array[i];
            j++;
        }

        for (int i = array.length-1; i>=0; i--){
            new_array[j] = array[i];
            j++;
        }

        System.out.println(Arrays.toString(new_array));
    }

}

