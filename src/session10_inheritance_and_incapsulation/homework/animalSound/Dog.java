package session10_inheritance_and_incapsulation.homework.animalSound;

public class Dog extends Animal {

    public Dog(String animalBread) {
        super(animalBread);
    }

    @Override
    public void sound() {
        System.out.println("Dog sound: 'bark'");
    }
}