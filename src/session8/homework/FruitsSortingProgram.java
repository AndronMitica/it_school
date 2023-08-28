package session8.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * 7. Create an ArrayList containing names of fruits.
 * Implement a custom sorting mechanism to arrange them in descending order based on their length.
 * If two fruits have the same length, sort them in alphabetical order.
 */
public class FruitsSortingProgram {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Tomatoes");
        fruits.add("Watermelon");
        fruits.add("Melon");

        System.out.print("Fruits list: " + fruits + " " + "\n");

        customSort(fruits);

        System.out.println("Fruits sorted by length and alphabetical order: " + fruits + " ");
        for (String fruit : fruits) {
            System.out.print(fruit);
        }
    }

    public static void customSort(ArrayList<String> fruits) {
        Collections.sort(fruits, Comparator.comparing(String::length).reversed().thenComparing(Comparator.naturalOrder()));
    }
}