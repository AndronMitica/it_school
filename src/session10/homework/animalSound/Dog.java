package session10.homework.animalSound;

public class Dog extends Animal {

    public Dog(String animalBread) {
        super(animalBread);
    }

    @Override
    public void sound() {
        System.out.println("Dog sound: 'bark'");
    }
}