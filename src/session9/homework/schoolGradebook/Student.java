package session9.homework.schoolGradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private String name;
    private UUID id;
    private List<Double> grades;


    public Student(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrade(List<Double> grade) {
        this.grades = grade;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0;
            for (double grade : grades) {
                grade += grade;
            }
            return sum / grades.size();
        }
    }
}