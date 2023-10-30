package session5_advanced_flow_control.homework;

/* 9. For-Each Loop
 * Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even,
 * or "Odd" if the number is odd. Utilize a for-each loop for this task.
 * */
public class PrintNumberFromArray {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 23, 11, 7, 32, 9, 6};

        System.out.println("Number - Type");

        for (int number : numbers) {
            String type = (number % 2 == 0) ? "Even" : "Odd";
            System.out.println(number + " " + type);
        }
    }
}