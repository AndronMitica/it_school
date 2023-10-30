package session10_inheritance_and_incapsulation.practice.hospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private final List<Patient> patients;
    private final List<Doctor> doctors;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    public void assignPatientToDoctor(Patient patient, Doctor doctor) {
        doctor.assignPatient(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}