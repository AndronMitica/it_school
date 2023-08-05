package session3_homework;

/*12. Create a program that takes an integer as input and then increments and decrements it by 1,
 displaying the output at each stage.*/

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        int number = scanner.nextInt();

        System.out.println("The incremented value of the number is:" + ++number);
        System.out.println("The decremented value of the number is " + --number);

        scanner.close();
    }
}