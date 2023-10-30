package session5_advanced_flow_control.homework;

/* 3. Counting Negative Numbers
 * Given an array of integers, write a program to count and print the number of negative integers in the array.
 * */
public class NegativeNumberCounter {

    public static void main(String[] args) {
        int[] numbers = {-5, -3, -1, 0, 2, 4, 5};
        int countNegative = 0;
        for (int number : numbers) {
            if (number < 0) {
                countNegative++;
            }
        }
        System.out.println("Count of negative numbers: " + countNegative);
    }
}