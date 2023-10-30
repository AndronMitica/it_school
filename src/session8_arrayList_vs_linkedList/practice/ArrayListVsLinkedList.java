package session8_arrayList_vs_linkedList.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new ArrayList<>();

        for(int index = 0; index < 10000000; index++){
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }
        // check if LinkedList is faster for add method
        long startTimeArrayListr = System.currentTimeMillis();
        for(int index = 0; index < 500000; index++){
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }


        long endTimerArrayList = System.currentTimeMillis();

        long startTimeLinkedListr = System.currentTimeMillis();
        for(int index = 0; index < 5000000; index++){
            arrayList.add(String.valueOf(index));
            linkedList.add(String.valueOf(index));
        }


        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("ArrayList time: " + (endTimerArrayList - startTimeArrayListr));
        System.out.println("LinkedList time: " + (endTimerLinkedList - startTimeLinkedListr));
    }
}