package session8.homework;

import java.util.Scanner;

/**
 * 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
 */
public class EvenOrOddIntegers {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 10; index++) {
            System.out.println("Element " + (index + 1) + ": ");
            numbers[index] = scanner.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}