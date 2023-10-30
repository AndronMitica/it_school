package session8_arrayList_vs_linkedList.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 5. Create an ArrayList that stores city names. Add at least five city names initially.
 * Then, prompt the user to add a city name.
 * If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
 */
public class CitiesArrayList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bucharest");
        cities.add("Rome");
        cities.add("London");
        cities.add("Lisbon");
        cities.add("Vienna");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city name: ");
        String city = scanner.nextLine();

        if (cities.contains(city)) {
            System.out.println("It's a duplicate!");
        } else {
            cities.add(city);
        }
        System.out.print("Updated city list: " + cities + " ");

        scanner.close();
    }
}