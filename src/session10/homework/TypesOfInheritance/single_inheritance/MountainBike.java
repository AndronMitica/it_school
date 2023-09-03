package session10.homework.TypesOfInheritance.single_inheritance;

public class MountainBike extends Bicycle{

    private String tireTypes;
    private String suspension;

    public String getTireTypes() {
        return tireTypes;
    }

    public void setTireTypes(String tireTypes) {
        this.tireTypes = tireTypes;
    }

    public void adjustSuspension (String newLevel) {
        suspension = newLevel;
        System.out.println("Suspension level modify to: " + newLevel);
    }
}