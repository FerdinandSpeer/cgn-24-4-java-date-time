package de.speer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //Step 1: Write code to output the current date and time.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("_______________________");
        //Step 2: Add a timespan of 2 weeks to the current date and output the new date.
        localDateTime = localDateTime.plusWeeks(2);
        System.out.println(localDateTime);
        System.out.println("_______________________");
        //Step 3: Compare the current date with a specified future date and output whether
        // the current date is before or after the specified date.
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(10);
        if (today.isBefore(futureDate)) {
            System.out.println("Today is before the future date");
        } else if (today.isAfter(futureDate)) {
            System.out.println("Today is after the future date");
        }
        System.out.println("_______________________");
        //Step 4: Calculate the difference in days between two arbitrary dates and output the result.
        LocalDate firstDate = LocalDate.of(2024, 9, 4);
        LocalDate secondDate = LocalDate.of(1990, 2, 19);
        long daysBetween= ChronoUnit.DAYS.between(secondDate, firstDate);
        System.out.println(daysBetween);
        System.out.println("_______________________");


    }


}