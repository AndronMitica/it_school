package session8.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. Create
 * 2 empty ArrayLists: studentList and graduateStudentList
 * populate studentList with 10 students
 * copy values from studentList to graduateStudentList
 * iterate through graduateStudentList and print each graduated student
 */
public class StudentAndGradeArrayList {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduatedStudentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the students name: ");
        for (int index = 0; index < 10; index++) {

            String studentName = scanner.nextLine();
            studentList.add(studentName);
        }

        graduatedStudentList.addAll(studentList);

        for (String student : graduatedStudentList) {
            System.out.print(student + " ");
        }
        scanner.close();
    }
}