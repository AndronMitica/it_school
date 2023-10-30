package session10_inheritance_and_incapsulation.homework.TypesOfInheritance.single_inheritance;

public class Bicycle {

    private int speed;
    private int gear;


    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("Gear changed to: " + newGear);
    }
    public void speedUp(int accelerate) {
        speed += accelerate;
        System.out.println("Speeding up. Current speed: " + speed);

    }
    public void applyBrakes(int applyBrake) {
        speed -= applyBrake;
        System.out.println("Applying brake. Current speed: " + speed);
    }
}