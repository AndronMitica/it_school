package session8.practice;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 10};
        //               0  1  2  3   4
        printArrayAverage(numbers);


        String[][] names = {{"Ms", "Mr"}, {"Maria", "John"}};
        printMultidimensionalArrayI(names);

//        printSortedArray(numbers);
//        printStringSortedArray(numbers[1]);
//
        printStringSearchResult(names[1], "Maria");
        printIntSearchResult(numbers, 10);
    }

    private static void printArrayAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(numbers[1]); // print 4


        int averageResult = sum / numbers.length;
        System.out.println("Arrays length: " + numbers.length);
        System.out.println("Arrays average: " + averageResult);

    }

    public static void printMultidimensionalArrayI(String[][] names) {
//        System.out.println(names[0][1] + " " + names[1][1]);

        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index2][index] + " ");
            }
            System.out.println();
        }
    }

    public static void printSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);

        for (String input : arrayInput) {
            System.out.println(input);

        }
    }

    public static void printStringSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);

        for (int input : arrayInput) {
            System.out.println(input);
        }
    }

    public static void printStringSearchResult(String[] arrayInput, String searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey) {
        Arrays.sort(arrayInput);
        System.out.println(Arrays.binarySearch(arrayInput, searchKey));
    }
}