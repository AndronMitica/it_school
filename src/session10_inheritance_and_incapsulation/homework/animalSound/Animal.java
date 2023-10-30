package session10_inheritance_and_incapsulation.homework.animalSound;

public class Animal {

    String animalBread;

    public Animal(String animalBread) {
        this.animalBread = animalBread;
    }

    public void sound() {
        System.out.println("Animal makes sounds");
    }
}