package session3_homework;

/* 4. Write a Java program that uses both the increment (++) and decrement (--) operators
 * in a loop to count up to 10 and then back down to 1.
 * */

public class Exercise4 {

        public static void main(String[] args) {
            System.out.println("Counting up to 10:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }

            System.out.println("\nCounting down to 1:");
            for (int i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }