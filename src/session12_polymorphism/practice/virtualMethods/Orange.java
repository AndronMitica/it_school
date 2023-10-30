package session12_polymorphism.practice.virtualMethods;

public class Orange extends Fruit {

    @Override
    public String taste() {
        return "orange is sour";
    }

    @Override
    public String color() {
        return "orange is orange";
    }
}