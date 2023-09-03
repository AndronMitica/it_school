package session10.homework.animalSound;

public class Cat extends Animal {

    public Cat(String animalBread) {
        super(animalBread);
    }

    @Override
    public void sound() {
        System.out.println("Cat sound: 'meow'");
    }
}