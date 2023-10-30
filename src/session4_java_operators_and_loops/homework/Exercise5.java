package session4_java_operators_and_loops.homework;

/*
 * 5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step,
 *  modify your program to print only the even numbers from 1 to 10.
 * */
public class Exercise5 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " "); // prints the numbers from 1 to 10
            if (i % 2 == 0) {
                System.out.print(i + " ");  // print the even numbers from 1 to 10
            }
        }
    }
}