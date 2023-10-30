package session11_abstraction.homework.marks;

public class MarksMain {

    public static void main(String[] args) {
        A studentA = new A(49, 65, 88);
        B studentB = new B(99, 100, 95);

        System.out.println("Student A percentage: " + studentA.getPercentage());
        System.out.println("Student B percentage: " + studentB.getPercentage());
    }
}