package session3_homework;

import java.util.Scanner;

/*7. Write a program where you perform operations between an integer and a double. Display the result.*/
public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("insert an fractional number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 - num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The subtraction of the numbers is: " + subtraction);
        System.out.println("The multiplication of the numbers is: " + multiplication);
        System.out.println("The division of the numbers is: " + division);
        System.out.println("The modulus of the numbers is: " + modulus);

        scanner.close();
    }
}