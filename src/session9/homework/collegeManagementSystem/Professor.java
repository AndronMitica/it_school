package session9.homework.collegeManagementSystem;

import java.time.LocalDate;
import java.util.Date;

public class Professor {
    private String firstName;
    private String lastName;
    private char sex;
    private int age;
    private LocalDate dateOfBirth;
    private String cnp;
    private String address;

    public Professor (String firstName, String lastName, char sex, int age, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Professor name: " + (firstName + lastName) + ", sex " + sex +
                ", age: " + age +
                ", date of birth: " + dateOfBirth;
    }
}