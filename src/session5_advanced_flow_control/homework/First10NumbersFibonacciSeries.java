package session5_advanced_flow_control.homework;

/* 8. For Loop
 * Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
 * */

public class First10NumbersFibonacciSeries {

    public static void main(String[] args) {
        int number = 10;
        int first = 0, second = 1;

        System.out.println("Fibonacci Series: ");

        for (int i = 1; i <= number; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}