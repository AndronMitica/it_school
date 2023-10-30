package session6_java_core_api.practice;

public class EqualsStringsExamples {

    public static void main(String[] args) {
        String color1 = "Blue";
        String color2 = "blue";

        System.out.println(color1.equals(color2));
        System.out.println(color1.equalsIgnoreCase(color2));
        System.out.println(color1.toLowerCase().equals(color2.toLowerCase()));

    }
}
