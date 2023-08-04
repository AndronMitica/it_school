package session3_homework;

import java.util.Scanner;

/*
 *2. Create a Java program where you increment and decrement the same variable.
 * Display the value of the variable after each operation.
 */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner firstValue = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        int userInput = firstValue.nextInt();
        System.out.println("Post increment: " + userInput++);
        System.out.println("Post decrement: " + userInput--);
        System.out.println("Pre increment: " + ++userInput);
        System.out.println("Pre decrement: " + --userInput);

        Scanner secondValue = new Scanner(System.in);
        System.out.println("Insert the second number: ");
        int userInput2 = secondValue.nextInt();
        System.out.println("Post increment: " + userInput2++);
        System.out.println("Post decrement: " + userInput2--);
        System.out.println("Pre increment: " + ++userInput2);
        System.out.println("Pre decrement: " + --userInput2);

        firstValue.close();
        secondValue.close();
    }
}