package session18;

import java.util.Arrays;

public class CharacterCounter {

    public static void main(String[] args) {
        String string = "Hello world ab";
        System.out.println(countWordsLongerThen(string,1));
    }

    public static int countWordsLongerThen(String input, int len) {
        return (int) Arrays.stream(input.split(" "))
                .filter(word -> word.length() > len)
                .count();
    }
}