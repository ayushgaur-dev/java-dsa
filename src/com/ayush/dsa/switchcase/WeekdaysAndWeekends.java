package com.ayush.dsa.switchcase;

import java.util.Scanner;

public class WeekdaysAndWeekends {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Day: ");
        String day = in.next();
        String DAY = day.toLowerCase();

        switch (DAY) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println(DAY + " Is a Weekday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println("Enter a valid day PLEASE");
        }
    }

}
