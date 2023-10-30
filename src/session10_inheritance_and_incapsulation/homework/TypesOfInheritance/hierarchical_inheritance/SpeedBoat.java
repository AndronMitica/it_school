package session10_inheritance_and_incapsulation.homework.TypesOfInheritance.hierarchical_inheritance;

public class SpeedBoat extends Boat {

    protected String engineType;
    private final double maxSpeed;


    public SpeedBoat(double length, double weight, double maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("State turboBoost: ON ");
    }

    @Override
    public void sail() {
        System.out.println("The speedboat is sailing. ");
    }
}