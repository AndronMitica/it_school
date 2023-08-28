package session7.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 3. Create a Specific Date
 * Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
 * Expected Output: A date object for 2025-8-19.
 */


public class CrateASpecificDate {

    public static void main(String[] args) {
        Date specificDate = createSpecificDate();
        System.out.println("Specific date: " + specificDate);
    }

    public static Date createSpecificDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse("2025-08-19");
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}