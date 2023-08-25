package session6.homework;

import java.util.Scanner;

/**
 * Duplicate Character Remover
 * Description: Design a program using StringBuilder that removes duplicate characters from a string.
 * For example, "balloon" should become "balon".
 */
public class DuplicateCharacterRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a sentence: ");
        String sentence = scanner.nextLine();

        String result = removeDuplicatedCharacters(sentence);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeDuplicatedCharacters(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (stringBuilder.indexOf(Character.toString(c)) == -1) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}