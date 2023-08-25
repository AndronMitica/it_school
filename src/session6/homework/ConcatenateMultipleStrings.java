package session6.homework;


import java.util.List;

/**
 * 3. Concatenate Multiple Strings
 * Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.
 */

public class ConcatenateMultipleStrings {

    public static String concatenateStrings(List<String> stringList) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : stringList) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Hello! " + "Today " + "is " + "thursday.");
        String concatenatedString = concatenateStrings(stringList);

        System.out.println("Concatenated Strings: " + concatenatedString);
    }
}