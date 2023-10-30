package session7_utility_classes.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * 9. Interval Between Dates
 * Description: Design a method titled daysBetween that reads two dates from the console
 * and computes the total number of days between them.
 * Input: Two dates given by the user in the format YYYY-MM-DD.
 * Expected Output: An integer showcasing the difference in days between the two dates.
 */
public class IntervalBetweenDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Enter first date (YYYY-MM-DD): ");
        String firstDate = scanner.nextLine();
        LocalDate firstDate1 = LocalDate.parse(firstDate);

        System.out.println("Enter second date (YYYY-MM-DD): ");
        String secondDate = scanner.nextLine();
        LocalDate secondDate1 = LocalDate.parse(secondDate);

        scanner.close();

        int difference = daysBetween(firstDate1, secondDate1);
        System.out.println("Difference in days: " + difference);
    }

    public static int daysBetween(LocalDate date1, LocalDate date2) {

        Period period = Period.between(date1, date2);
        return period.getDays();
    }
}