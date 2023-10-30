package session6_java_core_api.homework;


import java.util.Scanner;

/**
 * String Replacement
 * Description: Use the StringBuilder class to replace every occurrence of a substring within a given string with another substring.
 * For instance, replace "cat" with "dog" in the string "The cat sat on the mat."
 */
public class StringReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a sentence: ");
        String text = scanner.nextLine();

        System.out.println("Insert the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.println("Insert a replacement word: ");
        String newWord = scanner.nextLine();

        String result = replaceSubstring(text, oldWord, newWord);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String replaceSubstring(String input, String oldWord, String newWord){
        StringBuilder stringBuilder = new StringBuilder();
        int currentIndex = 0;

        while(currentIndex < input.length()){
            int nextIndex = input.indexOf(oldWord, currentIndex);

            if(nextIndex == -1){
                stringBuilder.append(input.substring(currentIndex));
                return stringBuilder.toString();
            }
            stringBuilder.append(input.substring(currentIndex,nextIndex));
            stringBuilder.append(newWord);
            currentIndex = nextIndex + oldWord.length();
        }
        return  stringBuilder.toString();
    }
}