package session3_java_operators.homework;

import java.util.Scanner;

/* 14. Create a program that checks if a user entered number is within a specific range (e.g., 1-100).
 * Use relational operators for the checks.
 * */
public class Exercise14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number:");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100) {
            System.out.println("The number is within the specified range.");
        } else {
            System.out.println("The number is out of the specified range.");
        }
        scanner.close();
    }
}