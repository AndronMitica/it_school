package session4.homework;

/*4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
 * Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
 * */
public class Exercise4 {

    public static void main(String[] args) {
        int heightOne = 30;
        int heightTwo = 50;

        String maximumHeight = heightOne > heightTwo ? "The first number is de greatest." : "The second number is the greatest.";
        System.out.println(maximumHeight);
    }
}