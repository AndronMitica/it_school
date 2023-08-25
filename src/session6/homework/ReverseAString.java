package session6.homework;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert some text: ");
        StringBuilder text = new StringBuilder(scanner.nextLine());

        System.out.println(text.reverse());
        scanner.close();
    }
}