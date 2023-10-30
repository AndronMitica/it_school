package session5_advanced_flow_control.homework;

import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print \"Hello word\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello world ");
                    break;
                case 2:
                    System.out.println("Enter your name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Your name is: " + name);
                    break;
                case 3:
                    System.out.println("Exiting ...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option. ");
                    continue;
            }
        }
    }
}