package session5_advanced_flow_control.homework;

import java.util.Scanner;

/* 7. Do-While Loop
 * Create a program where the user is prompted to guess a predefined number.
 * After each guess, the program should inform the user if the guess is too high or too low.
 * The program should keep prompting the user until they guess correctly.
 * Using a do-while loop, ensure the user is always asked at least once.
 * */
public class GuessTheNumberApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 10;

        System.out.println("Guess the number!\n The number is: ");
        int number = 0;

        do {
            number = scanner.nextInt();
            if (number < numberToGuess) {
                System.out.println("Too low.");
            } else if (number > numberToGuess) {
                System.out.println("Too high.");
            } else {
                System.out.println("Congratulation! You guessed the number! ");
            }
        } while (number != numberToGuess);
    }
}