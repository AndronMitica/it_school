package session12_polymorphism.practice.runntimeChangeBehavior;

public class Sword implements Weapon{
    @Override
    public void use() {
        System.out.println("Using sword.");
    }
}