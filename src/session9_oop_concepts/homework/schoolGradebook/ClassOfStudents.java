package session9_oop_concepts.homework.schoolGradebook;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.UUID;

public class ClassOfStudents {

    String nameOfClass;
    List<Student> students;

    public ClassOfStudents(String nameOfClass) {
        this.nameOfClass = nameOfClass;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void gradeCheck(String studentName, double grade) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                gradeCheck(student, grade);
            }
        }
    }

    public void gradeCheck(UUID studentID, double grade) {
        for (Student student : students) {
            if (student.getId().equals(studentID)) {
                gradeCheck(student, grade);
            }
        }
    }

    public double calculateStudentAverage(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                return calculateStudentAverage(student);
            }
        }
        return -1;
    }

    public double calculateStudentAverage(UUID uuid) {
        for (Student student : students) {
            if (student.getId().equals(uuid)) {
                return calculateStudentAverage(student);
            }
        }
        return -1;
    }

    public void printStudentsInClass() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() +
                    " Student name: " + student.getName() +
                    " Grade Average " + calculateStudentAverage(student.getName()));
        }
    }

    private double calculateStudentAverage(Student student) {
        double sumGrades = 0;
        for (double grade : student.getGrades()) {
            sumGrades += grade;
        }
        return sumGrades / student.getGrades().size();
    }

    private void gradeCheck(Student student, double grade) {
        student.getGrades().add(grade);
    }
}