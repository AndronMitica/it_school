package session10_inheritance_and_incapsulation.homework.TypesOfInheritance.multilevel_inheritance;

public class Car {

    protected String make;
    protected String model;
    protected int year;


    public void start() {
        System.out.println("Car is starting ...");

    }

    public void stop() {
        System.out.println("Car is stopping ...");
    }

    public void accelerate() {
        System.out.println("Car is accelerating ...");
    }
}
