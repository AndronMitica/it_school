package session3.homework;

import java.util.Scanner;

/*13. Write a program to calculate the price after discount.
* Take the original price and discount percentage as input.
* Use compound assignment operator to perform the calculation.
* */
public class Exercise13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the original price: ");
        int price = scanner.nextInt();
        System.out.println("Insert the discount value: ");
        int discount = scanner.nextInt();

        price -= (price * discount / 100);
        System.out.println("The price after applying the discount is: " + price);

        scanner.close();
    }
}