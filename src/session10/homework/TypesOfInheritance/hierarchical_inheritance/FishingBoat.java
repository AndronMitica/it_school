package session10.homework.TypesOfInheritance.hierarchical_inheritance;

public class FishingBoat extends Boat {
    private final double fishCapacity;
    private final String typeOfNet;

    public FishingBoat(double length, double weight, double fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("Cast net system state: ON ");
    }

    @Override
    public void sail() {
        System.out.println("The fishing boat is sailing");
    }
}