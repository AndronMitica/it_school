package session4_java_operators_and_loops.homework;

/*8. Write a Java program to calculate the factorial of a number using a for loop.
 * Declare an integer variable number and assign a value to it.
 * Then calculate and print the factorial of number.
 * */

public class Exercise8 {

    public static void main(String[] args) {
        int fact = 1;
        int number = 4;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}