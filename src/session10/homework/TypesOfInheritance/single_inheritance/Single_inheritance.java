package session10.homework.TypesOfInheritance.single_inheritance;

public class Single_inheritance {

    public static void main(String[] args) {

        System.out.println("Bicycle: ");
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(4);
        bicycle.speedUp(120);
        bicycle.applyBrakes(10);
        System.out.println();

        System.out.println("MountainBike: ");
        MountainBike mountainBike = new MountainBike();
        mountainBike.setTireTypes("off-road");
        mountainBike.adjustSuspension("high");
        mountainBike.changeGear(2);
        mountainBike.speedUp(35);
        mountainBike.applyBrakes(5);
    }
}