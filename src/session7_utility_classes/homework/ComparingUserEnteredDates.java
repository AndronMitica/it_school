package session7_utility_classes.homework;

import java.util.Scanner;

/**
 * 4. Comparing User-Entered Dates
 * Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal,
 * and false otherwise.
 * Input: Two dates entered by the user in the format YYYY-MM-DD.
 * Expected Output:
 * true if both dates are equal.
 * false if they are different.
 */

public class ComparingUserEnteredDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first date (format YYYY-MM-DD): ");
        String dateOne = scanner.nextLine();

        System.out.println("Enter second date (format YYYY-MM-DD): ");
        String dateTwo = scanner.nextLine();

        boolean result = areDatesEqual(dateOne, dateTwo);
        System.out.println(result);
    }

    public static boolean areDatesEqual(String localDate1, String localDate2) {
        return localDate1.equals(localDate2);
    }
}