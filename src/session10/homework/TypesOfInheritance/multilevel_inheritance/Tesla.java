package session10.homework.TypesOfInheritance.multilevel_inheritance;

public class Tesla extends ElectricCar {

    private final String autopilotVersion;

    public Tesla(String make, String model, int year, double batteryCapacity, double range, String autopilotVersion) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.batteryCapacity = batteryCapacity;
        this.range = range;
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Autopilot state: ON ");
    }
}