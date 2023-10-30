package session4_java_operators_and_loops.homework;

/* 10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
 * Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
 * Print both lists and observe the output.
 * */

import java.util.ArrayList;

public class Exercise10 {

    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo;

        listOne.add("Element1");
        listOne.add("Element2");
        listOne.add("Element3");

        listTwo = listOne;

        listOne.add("Element4");

        System.out.println("List One: " + listOne);
        System.out.println("List Two: " + listTwo);
    }
}