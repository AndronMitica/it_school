package session3_homework;

import java.util.Scanner;

/*1. Write a Java program to take two numbers as input
 * and display the result of addition, subtraction, multiplication, division, and modulus.
 */
public class Exercise1 {

    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Insert the first number: ");
        double userInput = firstNumber.nextDouble();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Insert the second number: ");
        double userInput2 = secondNumber.nextDouble();

        System.out.println("The addition result is: " + (userInput + userInput2));
        System.out.println("The subtraction reslt is: " + (userInput - userInput2));
        System.out.println("The multiplication result is: " + (userInput * userInput2));
        System.out.println("The division result is: " + (userInput / userInput2));
        System.out.println("The modulus result is: " + (userInput % userInput2));

        firstNumber.close();
        secondNumber.close();
    }
}