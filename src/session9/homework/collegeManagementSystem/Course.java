package session9.homework.collegeManagementSystem;

import java.time.Duration;

public class Course {


    private final String courseTitle;
    private final String courseDescription;
    private final String courseSchedule;
    private final Duration courseDuration;
    private Professor courseAssignedProfessor;

    public Course(String courseTitle, String courseDescription, String courseSchedule, Duration courseDuration, Professor courseAssignedProfessor) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseSchedule = courseSchedule;
        this.courseDuration = courseDuration;
        this.courseAssignedProfessor = courseAssignedProfessor;


    }

    public void SetProfessor(Professor professor) {
        this.courseAssignedProfessor = courseAssignedProfessor;
    }

    public String toString() {
        return "Course name: " + courseTitle + ", description: " + courseDescription + ", schedule: " + courseDescription + ", duration: " + courseDuration.toString() + ", assignedProfessor: " + courseAssignedProfessor.toString();
    }
}