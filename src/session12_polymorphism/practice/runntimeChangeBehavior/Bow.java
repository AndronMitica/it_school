package session12_polymorphism.practice.runntimeChangeBehavior;

public class Bow implements Weapon{

    @Override
    public void use() {
        System.out.println("Using bow.");
    }
}