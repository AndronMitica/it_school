package session9_oop_concepts;

public class Car {

    String Brand;
    String Model;
    int speed;

    void accelerate(){
        speed += 10;
    }
    void decelerate(){
        speed += -10;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}