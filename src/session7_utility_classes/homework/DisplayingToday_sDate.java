package session7_utility_classes.homework;
/**
 * 1. Displaying Today's Date
 * Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
 * Expected Output: Today's date in the format YYYY-MM-DD.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayingToday_sDate {

    public static void main(String[] args) {

        printFormattedLocalDateTime();
    }

    public static void printFormattedLocalDateTime() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatDateTime = localDate.format(formatter);

        System.out.println(formatDateTime);
    }
}