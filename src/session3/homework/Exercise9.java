package session3.homework;

/* 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.*/

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the length of the rectangle: ");
        double lengthValue = scanner.nextDouble();
        System.out.println("Insert the breadth of the rectangle: ");
        double breadthValue = scanner.nextDouble();

        double area = lengthValue * breadthValue;
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}