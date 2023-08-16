package session5.homework;

import java.util.Scanner;

/* 11. Break Statement
 * Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
 * If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
 * */
public class AverageOfNumbers {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 for calculate the average and exit):");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the entered number: " + average);
        } else {
            System.out.println("No numbers entered!");
        }
        scanner.close();
    }
}