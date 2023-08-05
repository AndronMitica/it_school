package session3_homework;

import java.util.Scanner;

/* 6. Write a Java program that takes two numbers from the user and uses relational operators
 * to display whether the first number is greater than, less than, or equal to the second number.
 * */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        int userInput = scanner.nextInt();
        System.out.println("Insert the second number: ");
        int userInput2 = scanner.nextInt();

        if (userInput < userInput2) {
            System.out.println("The first number is less than the second number.");
        } else if (userInput > userInput2) {
            System.out.println("The first number is grater than the second number. ");
        } else {
            System.out.println("The numbers are equal. ");
        }
        scanner.close();
    }
}