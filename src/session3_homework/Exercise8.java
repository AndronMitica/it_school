package session3_homework;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

/*8. Create a program that takes two byte values, adds them together,
 and stores the result in a byte variable.*/
public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        byte userInput = scanner.nextByte();
        System.out.println("insert the second number: ");
        byte userInput2 = scanner.nextByte();

        byte resultByte = (byte) (userInput + userInput2);
        System.out.println("The result is: " + resultByte);

        scanner.close();
    }
}