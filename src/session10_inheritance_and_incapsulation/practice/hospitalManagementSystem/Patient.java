package session10_inheritance_and_incapsulation.practice.hospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private final String name;
    private final int age;
    private final List<String> medicalHistory;
    private final int patientID;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
        this.patientID = generatePatientID();
    }

    public void addMedicalHistory(String history) {
        medicalHistory.add(history);
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    private int generatePatientID() {
        return (int) (Math.random() * 10000);
    }
}