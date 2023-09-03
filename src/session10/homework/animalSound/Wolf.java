package session10.homework.animalSound;

public class Wolf extends Animal {

    public Wolf(String animalBread) {
        super(animalBread);
    }

    @Override
    public void sound() {
        System.out.println("Wolf sound: 'how'");
    }
}