package session5.homework;

/*String Reverser
 * Ask the user to enter a string. Print the reversed version of this string.
 * */

import java.util.Scanner;

public class ReversedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some text: ");
        String text = scanner.next();

        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(reverse);
        scanner.close();
    }
}