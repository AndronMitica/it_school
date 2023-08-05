package session3_homework;

/* 4. Write a Java program that uses both the increment (++) and decrement (--) operators
 in a loop to count up to 10 and then back down to 1. */

public class Exercise4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println();
            for (int j = 10; j >= 1; j--) {
                System.out.println(j);
            }
        }
    }
}