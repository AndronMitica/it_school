package session9.homework.collegeManagementSystem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        List<Professor> professors = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        Professor professor1 = new Professor("Mark", "Twain", 'M', 56, LocalDate.of(1950, 12, 23));
        Professor professor2 = new Professor("Sarah", "White", 'F', 45, LocalDate.of(1980, 12, 05));

        Student student1 = new Student("Paul", "Roraru", 'M', "1232344566", LocalDate.of(1999, 12, 03));
        Student student2 = new Student("Raluca", "Popescu", 'F', "123456", LocalDate.of(1999, 02, 01));

        Course math = new Course("Math", "Calculations", "Every Monday", Duration.of(4, ChronoUnit.HOURS), professor1);
        Course english = new Course("English", "learning English language", "Everyday", Duration.of(5, ChronoUnit.HOURS), professor2);

        professors.add(professor1);
        professors.add(professor2);

        courses.add(math);
        courses.add(english);

        students.add(student1);
        students.add(student2);

        for (Professor professor : professors) {
            System.out.println(professor);
        }
        for (Course course : courses) {
            System.out.println(course);
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}