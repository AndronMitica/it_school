package session10.homework.TypesOfInheritance.hierarchical_inheritance;

public class Boat {

    private double length;
    private double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void sail() {
        System.out.println("The boat is sailing. ");
    }
}