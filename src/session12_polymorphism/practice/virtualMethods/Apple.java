package session12_polymorphism.practice.virtualMethods;

public class Apple extends Fruit {

    @Override
    public String taste() {
        return "apple is sweet";
    }

    @Override
    public String color() {
        return "apple is red";
    }
}