package session5.homework;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

/* 12. Continue Statement
 * Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
 * If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the numbers: ");

        for (int i = 1; i <= 10; i++) {
            int number = scanner.nextInt();

            if (number <= 5) {
                continue;
            }
            sum += number;
        }
        System.out.println("The sum of numbers grater than 5 is: " + sum);
        scanner.close();
    }
}