package session7_utility_classes.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 8. Weekday Identifier
 * Description: Construct a method named findDayOfWeek that takes in a date
 * and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
 * Input: A date in the format YYYY-MM-DD.
 * Expected Output: The day of the week in string format (e.g., "Wednesday").
 */

public class WeekDayIdentifier {

    public static void main(String[] args) {
        System.out.println(findDayOfWeek());
    }

    public static DayOfWeek findDayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a date in the format YYYY-MM-DD: ");
        LocalDate localDate = LocalDate.parse(scanner.nextLine());

        scanner.close();
        return localDate.getDayOfWeek();
    }
}