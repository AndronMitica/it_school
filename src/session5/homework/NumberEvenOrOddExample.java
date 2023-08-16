package session5.homework;

import java.util.Scanner;

/* 1. Even or Odd Checker
 * Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".
 */
public class NumberEvenOrOddExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
        scanner.close();
    }
}