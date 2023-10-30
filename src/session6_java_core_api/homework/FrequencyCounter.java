package session6_java_core_api.homework;

import java.util.Scanner;

/**
 * Frequency Counter
 * Description: Using StringBuilder, write a program that counts the frequency of each character in a string.
 */
public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a String: ");
        String input = scanner.nextLine();

        String result = stringCounter(input);
        System.out.println("Result:\n " + result);

        scanner.close();
    }

    public static String stringCounter(String input) {
        int[] frequencyArray = new int[256];
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            frequencyArray[c]++;
        }

        System.out.println("Character frequency: ");
        for (int index = 0; index < frequencyArray.length; index++) {
            if (frequencyArray[index] > 0) {
                stringBuilder.append("'" + (char) index + "': " + frequencyArray[index] + "\n");
            }

        }
        return stringBuilder.toString();
    }
}