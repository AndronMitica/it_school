package session3_java_operators.homework;

import java.util.Scanner;

/* 3. Write a program to check if a number is positive or negative using logical complement operator.*/

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert one number: ");
        int userInput = scanner.nextInt();
        if (!(userInput > 0)) {
            System.out.println("The number is negative. ");
        } else {
            System.out.println("The number is positive. ");
        }

        scanner.close();
    }
}