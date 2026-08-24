package com.ayush.dsa.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class StoreOddEvenInDifferentArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array");
        for(int i= 0; i< array.length; i++){
           array[i] = in.nextByte();
        }
        System.out.println(Arrays.toString(array));

        int odd_count = 0;
        int even_count = 0;

        for (int i = 0; i< array.length; i++){
            if (array[i]% 2 == 0){
                even_count++;
            }
            else {
                odd_count++;
            }
        }

        int j =0;
        int k= 0;


        System.out.printf("Odd numbers: %d", odd_count);
        System.out.println("");
        System.out.printf("Even numbers: %d", even_count);
        System.out.println("");

        int[] odd_array = new int[odd_count];
        int[] even_array = new int[even_count];



        for (int i = 0; i< array.length; i++){
            if (array[i]%2 ==0){
                even_array[j] = array[i];
                j++;
            }
            else{
                odd_array[k] = array[i];
                k++;
            }
        }
        System.out.println("odd array: ");
        System.out.println(Arrays.toString(odd_array));
        System.out.println("even array: ");
        System.out.println(Arrays.toString(even_array));

    }
}
