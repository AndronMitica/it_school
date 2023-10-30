package session7_utility_classes.homework;

import java.time.LocalDate;

/**
 * 5. Is Today a Specific Date?
 * Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
 * Expected Output:
 * true if today's date is 2019-12-10.
 * false otherwise.
 */

public class IsTodayASpecificDay {

    public static void main(String[] args) {

        System.out.println(isTodaySpecificDate());
    }

    public static boolean isTodaySpecificDate() {
        LocalDate localDate = LocalDate.now();
        String specifiedDate = "2019-12-10";
        System.out.println(localDate);

        return localDate.equals(specifiedDate);
    }
}