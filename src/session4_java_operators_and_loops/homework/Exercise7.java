package session4_java_operators_and_loops.homework;

import java.util.Scanner;

/* 7. Write a Java program that determines the type of a triangle based on its sides.
 * Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
 * Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
 * */
public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first side value: ");
        double sideOne = scanner.nextDouble();

        System.out.println("Insert second side value: ");
        double sideTwo = scanner.nextDouble();

        System.out.println("Insert third side value");
        double sideThree = scanner.nextDouble();

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isosceles" : "Scalene";
        System.out.println("The triangle type is " + triangleType + ".");

        /* if - else if - else method
         if (sideOne == sideTwo && sideTwo == sideThree){
            System.out.println("The triangle is Equilateral.");
        } else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        } */
    }
}
