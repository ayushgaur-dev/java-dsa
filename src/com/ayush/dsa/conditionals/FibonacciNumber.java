package com.ayush.dsa.conditionals;
import java.util.Scanner;
public class FibonacciNumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int p = 0;
        int i = 1;

        for(int a=0; a<max ; a++){
            System.out.println(p);

            int next = p + i;
            p = i;
            i = next;
        }







        }


    }

