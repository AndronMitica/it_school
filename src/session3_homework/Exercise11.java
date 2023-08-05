package session3_homework;

import java.util.Scanner;

/*11. Write a Java program that takes two boolean inputs from a user.
Apply the logical negation operator (!) to each and print the result.*/
public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first boolean value: ");
        boolean bool1Value = scanner.nextBoolean();
        System.out.println("Insert second boolean value: ");
        boolean bool2Value = scanner.nextBoolean();

        System.out.println("First boolean entered value: " + bool1Value);
        System.out.println("Fist boolean value after conversion: " + !(bool1Value));

        System.out.println("Second boolean entered value: " + bool2Value);
        System.out.println("Second boolean value after conversion: " + !(bool2Value));

        scanner.close();
    }
}