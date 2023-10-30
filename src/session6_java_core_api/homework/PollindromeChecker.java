package session6_java_core_api.homework;

import java.util.Scanner;

public class PollindromeChecker {


    /**
     * 2. Palindrome Checker
     * Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
     * A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
     */
    public class PolindromeChecker {

        public static boolean isPolindrome(String input) {
            StringBuilder stringBuilder = new StringBuilder(input);
            String inputReversed = stringBuilder.reverse().toString();
            return input.equalsIgnoreCase(inputReversed);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter some text: ");
            String text = scanner.nextLine();

            if (isPolindrome(text)) {
                System.out.println("The entered text is a polindrome!");
            } else {
                System.out.println("The entered text is not a polindrome!");
            }
            scanner.close();
        }
    }
}