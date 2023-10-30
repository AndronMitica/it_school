package session6_java_core_api.homework;

import java.util.Scanner;

/**
 * 4. Removing Vowels
 * Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.
 */
public class RemovingVowels {

    public static String removingVowels(String input) {
        String removedVowels = input.replaceAll("[aeiouAEIOU]", "");

        return removedVowels;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("The entered text without vowels is:" + removingVowels(text));
    }
}