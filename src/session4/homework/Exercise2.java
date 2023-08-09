package session4.homework;

/* 2. Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
 * Use an equality operator to compare these two numbers and print the result.
 * Do the same for two String objects firstString and secondString with the same value,
 * but use the equals() method for comparison. Print the result
 * */
public class Exercise2 {

    public static void main(String[] args) {
        int firstNumber = 45;
        int secondNumber = 30;

        System.out.println(firstNumber > secondNumber);

        String firstString = "45";
        String secondString = "30";

        System.out.println(firstString.equals(secondString));
    }
}