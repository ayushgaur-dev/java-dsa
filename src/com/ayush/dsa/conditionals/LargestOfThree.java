package com.ayush.dsa.conditionals;

import java.util.Scanner;

public class LargestOfThree {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //find the largest number

//       if(a>b && a>c){
//           System.out.println("a is largest. ");
//       } else if (b>a && b>c) {
//           System.out.println("b is largest");
//       }
//       else {
//           System.out.println("c is largest");
//       }

       int max = a;
       if(max<c){
           max=c;
       }
       if(max<b){
           max=b;
       }

       System.out.println(max);
   }
}
