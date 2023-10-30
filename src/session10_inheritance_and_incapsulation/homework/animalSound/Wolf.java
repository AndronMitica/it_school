package session10_inheritance_and_incapsulation.homework.animalSound;

public class Wolf extends Animal {

    public Wolf(String animalBread) {
        super(animalBread);
    }

    @Override
    public void sound() {
        System.out.println("Wolf sound: 'how'");
    }
}