package session5.homework;

import java.util.Scanner;

/*5. Fibonacci Series Generator
 *Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.
 * */
public class FibonacciSeriesGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int[] fibonacciSeries = generateFibonacci(n);
            System.out.println("Fibonacci Series:");
            for (int num : fibonacciSeries) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static int[] generateFibonacci(int n) {
        int[] fibonacciSeries = new int[n];

        if (n >= 1) {
            fibonacciSeries[0] = 0;
        }
        if (n >= 2) {
            fibonacciSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }
}