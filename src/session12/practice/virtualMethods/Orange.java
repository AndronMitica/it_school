package session12.practice.virtualMethods;

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