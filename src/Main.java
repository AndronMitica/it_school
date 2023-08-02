package session1_homework;

import java.util.Scanner;

public class Exercise4 {
    /* 4. Simple Input/Output: Write a program that asks the user to enter two numbers, perform addition on those numbers, and prints out the result.*/
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        System.out.println("The sum is " + (num1 + num2));
        if((num1 + num2) <=9){
            System.out.println("The result has one digit.");
        } else if ((num1 + num2) > 10){
            System.out.println("The result has two digits.");
        }
    }
}