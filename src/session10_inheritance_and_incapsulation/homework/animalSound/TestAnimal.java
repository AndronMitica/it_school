package session10_inheritance_and_incapsulation.homework.animalSound;

public class TestAnimal {
    
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        animal.sound();

        Animal cat = new Cat("cat");
        cat.sound();
        Animal dog = new Dog("dog");
        dog.sound();
        Animal wolf = new Wolf("horse");
        wolf.sound();
    }
}