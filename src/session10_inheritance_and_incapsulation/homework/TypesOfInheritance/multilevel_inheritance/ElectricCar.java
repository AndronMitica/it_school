package session10_inheritance_and_incapsulation.homework.TypesOfInheritance.multilevel_inheritance;

public class ElectricCar extends Car {
    protected double batteryCapacity;
    protected double range;

    public void charge() {
        System.out.println("The vehicle is charging ... ");
    }
}