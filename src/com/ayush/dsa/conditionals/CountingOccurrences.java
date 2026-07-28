package com.ayush.dsa.conditionals;

import java.util.Scanner;

public class CountingOccurences {
   public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt(); //input number of many digits

        int desired_digit = in.nextInt(); // input the digit whose occurrence u want to count

        int i = 0;
        int count = 0;

        while(i<10){
            int digit = number % 10;
            if(digit == desired_digit){
                count++;
            }

            number = number/10;
            i++;

        }

        System.out.println(count);

    }
}
