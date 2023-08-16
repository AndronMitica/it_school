package session5.homework;

import java.util.Scanner;

/* While Loop
 * Write a program that asks the user to enter numbers.
 * The program should continue prompting the user until they enter -1.
 * After they enter -1, print the sum of all numbers entered (excluding -1)
 * */
public class WhileLoopApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers(enter -1 to stop): ");

        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of entered numbers (excluding -1): " + sum);
        scanner.close();
    }
}