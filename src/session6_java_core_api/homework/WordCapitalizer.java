package session6_java_core_api.homework;

import java.util.Scanner;

/**
 * Word Capitalizer
 * Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.
 */
public class WordCapitalizer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert some text: ");
        String input = scanner.nextLine();

        String result = capitalizeFirstLetter(input);
        System.out.println(result);

        scanner.close();
    }

    public static String capitalizeFirstLetter(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        char[] charArray = input.toCharArray();

        stringBuilder.append(Character.toUpperCase(charArray[0]));
        for (int index = 1; index < charArray.length; index++) {
            if (Character.isWhitespace(charArray[index - 1])) {
                stringBuilder.append(Character.toUpperCase(charArray[index]));
            } else {
                stringBuilder.append(charArray[index]);
            }
        }
        return stringBuilder.toString();
    }
}