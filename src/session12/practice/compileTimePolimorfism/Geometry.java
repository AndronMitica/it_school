package session12.practice.compileTimePolimorfism;

public class Geometry {

    //method overloading
    //calculate aria of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    //calculate aria of a triangle
    public double area (double base, double height) {
        return (base * height) / 2;
    }
}