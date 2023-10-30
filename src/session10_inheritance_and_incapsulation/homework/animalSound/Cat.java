package session10_inheritance_and_incapsulation.homework.animalSound;

public class Cat extends Animal {

    public Cat(String animalBread) {
        super(animalBread);
    }

    @Override
    public void sound() {
        System.out.println("Cat sound: 'meow'");
    }
}