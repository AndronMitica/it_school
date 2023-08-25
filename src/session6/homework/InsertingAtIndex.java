package session6.homework;

import java.util.Scanner;

/**
 * Inserting at Index
 *    Description: Write a Java program that inserts a given string into another string
 *    at a specified index using the StringBuilder class.
 */
public class InsertingAtIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first sentence: ");
        String firstSentence = scanner.nextLine();

        System.out.println("Insert the second sentence: ");
        String secondSentence = scanner.nextLine();

        System.out.println("Give the index to insert at: ");
        int insertIndex = scanner.nextInt();

        String result = insertString(firstSentence,secondSentence, insertIndex);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String insertString (String firstInput, String secondInput, int index){
        StringBuilder stringBuilder = new StringBuilder(firstInput);
        return stringBuilder.insert(index, secondInput).toString();
    }
}
