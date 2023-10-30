package session4_java_operators_and_loops.homework;

/*1. Write a Java program where you create two String objects named stringOne and stringTwo
 * with the same value "OpenAI". Check and print whether they refer to the same object.
 * */
public class Exercise1 {

    public static void main(String[] args) {
        String object1 = "OpenAI";
        String object2 = "OpenAI";

        System.out.println(object1.equals(object2));
    }
}