package session7_utility_classes.homework;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 7. Date Arithmetic
 * Description: Write a method named addWeeksToToday that accepts an integer as its argument.
 * This integer denotes the number of weeks.
 * The method should add this number of weeks to today's date and return the resultant date.
 * Input: An integer n (e.g., 4).
 * Expected Output: A date object that is n weeks from today.
 */

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of weeks: ");
        int weeksToAdd = scanner.nextInt();

        System.out.println(LocalDate.now());
        System.out.println("Weeks to add: " + weeksToAdd + " new date: " + addWeeksToToday(weeksToAdd));

        scanner.close();
    }

    public static LocalDate addWeeksToToday(int weeksInput) {
        return LocalDate.now().plusWeeks(weeksInput);
    }
}