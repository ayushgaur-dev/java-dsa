package com.ayush.dsa.funtionsandmethods;
import java.util.Scanner;

public class StringParameter {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur name nga: ");
        String myName = in.next();
        String greet = urGreet(myName);
        System.out.println(greet);
    }

    static String urGreet(String name){
        String message = "Very splendid my nga " + name;
        return message;
    }
}

