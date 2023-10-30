package session8_arrayList_vs_linkedList.homework;

import java.util.Scanner;

/**
 * 8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists.
 * If it does, print out its position in the array.
 */
public class MovieTitleSearch {

    public static void main(String[] args) {
        String[] movieTitles = {"The pianist", "La vita e bella", "After Earth", "Fight Club", "Fast and Furious"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the movie to search: ");
        String targetMovie = scanner.nextLine();

        int result = linearSearch(movieTitles, targetMovie);

        if ((result != -1)) {
            System.out.println("The movie was found at the position: " + result);
        } else {
            System.out.println("The movie was not found.");
        }
    }

    public static int linearSearch(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}