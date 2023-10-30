package session10_inheritance_and_incapsulation.homework.TypesOfInheritance.hierarchical_inheritance;

public class Hierarchical_inheritance {

    public static void main(String[] args) {
        Boat boat = new Boat(25.50, 2500);
        boat.sail();
        System.out.println();

        SpeedBoat speedBoat = new SpeedBoat(15.66, 4500, 150, "DOHC turboCharged");
        speedBoat.sail();
        speedBoat.turboBoost();
        System.out.println();

        FishingBoat fishingBoat = new FishingBoat(60.89, 25999, 4500, "Textile");
        fishingBoat.sail();
        fishingBoat.castNet();
        System.out.println();
    }
}