package session9_oop_concepts.homework.collegeManagementSystem;

import java.time.LocalDate;

public class Student {

    private String firstName;
    private String lastName;
    private char sex;
    private int age;
    private LocalDate dateOfBirth;
    private String cnp;
    private String address;

    public Student(String firstName, String lastName, char sex, String cnp, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.cnp = cnp;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String GetLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCnp() {
        return cnp;
    }

    public String getAddress() {
        return address;
    }

    public void SetFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }

    public void SetSex(char sex) {
        this.sex = sex;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public void SetDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void SetCnp(String cnp) {
        this.cnp = cnp;
    }

    public void SetAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student name: " + (firstName + " " + lastName) + ", sex " + sex +
                ", date of birth: " + dateOfBirth;
    }
}