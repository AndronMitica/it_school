package session8.practice;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 13, 17, 20};
        //               0  1   2  3  4   5
        int target = 20;

        int result = binarySearch(myArray, target);

        if (result != -1) {
            System.out.println("Target found! " + target + " at position");
        } else {
            System.out.println("Target not found! " + target);
        }
    }

    public static int binarySearch(int[] array, int targer) {
        int leftSide = 0;
        int rightSide = array.length - 1;

        while (leftSide <= rightSide) {
            int middle = leftSide + (rightSide - leftSide) / 2;
            if (array[middle] == targer) {
                return middle;
            } else if (array[middle] < targer) {
                leftSide = middle + 1;
            } else if ((array[middle] > targer)) {
                rightSide = middle - 1;
            }
        }
        return -1;
    }
}