package codingkata;

public class LengthOfString {

    /* Length of a String
     * Description: Write a function that takes a string as input and returns its length.
     * Avoid using the built-in length() method.
     * */

    public static String getString;

    public static void main(String[] args) {
        System.out.println(getStringLength("test"));

    }

    public static int getStringLength(String input) {
        int count = 0;
        for (char character : input.toCharArray()) {
            count++;
        }
        return count;
    }

}