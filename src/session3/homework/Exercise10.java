package session3.homework;

import java.util.Scanner;

/* 10. Write a program that reverses the sign of an entered integer using unary minus operator.*/
public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int numberValue = scanner.nextInt();
        int reversedNumber = -numberValue;
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}