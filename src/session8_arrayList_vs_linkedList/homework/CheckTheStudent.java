package session8_arrayList_vs_linkedList.homework;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list.
 * If it does, remove that name from the list.
 */
public class CheckTheStudent {

    public static void main(String[] args) {
        LinkedList<String> studentsName = new LinkedList<>();
        studentsName.add("Bogdan");
        studentsName.add("Alina");
        studentsName.add("Andrei");
        studentsName.add("Ciprian");
        studentsName.add("Jack");

        System.out.println("Enter the name to be verified: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (studentsName.contains(name)) {
            studentsName.remove(name);
            System.out.println("Student removed: " + name + "\n" + "Updated list: " + studentsName);
        } else {
            System.out.println("Student not found in the list.");
        }
    }
}