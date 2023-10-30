package session12_polymorphism.practice.compositionOverInheritance.composition;

public class Car {

    private final Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
