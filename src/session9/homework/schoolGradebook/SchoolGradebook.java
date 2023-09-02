package session9.homework.schoolGradebook;


public class SchoolGradebook {

    public static void main(String[] args) {
        ClassOfStudents seventhGrade = new ClassOfStudents("Third Grade");
        seventhGrade.addStudent(new Student("Bogdan"));
        seventhGrade.addStudent(new Student("Alina"));
        seventhGrade.addStudent(new Student("Alma"));
        seventhGrade.addStudent(new Student("Sarah"));
        seventhGrade.addStudent(new Student("Fifi"));
        seventhGrade.addStudent(new Student("William"));
        seventhGrade.printStudentsInClass();
        seventhGrade.gradeCheck("Bogdan", 6);
        seventhGrade.gradeCheck("Alina", 3);
        seventhGrade.gradeCheck("Alma", 9.92);
        seventhGrade.gradeCheck("Sarah", 7.78);
        seventhGrade.gradeCheck("Fifi", 5.01);
        seventhGrade.printStudentsInClass();
    }
}