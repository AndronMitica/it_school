package session12_polymorphism.practice.objectVsReference;

public class Car extends Vehicle{

    @Override
    public String fuelType() {
        return "petrol";
    }
}