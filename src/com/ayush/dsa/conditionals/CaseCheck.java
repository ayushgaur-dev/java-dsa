package com.ayush.dsa.conditionals;
import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        char a = in.next().trim().charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println("Is uppercase");
        }
        else{
            System.out.println("Is lowercase");
        }



    }
}
