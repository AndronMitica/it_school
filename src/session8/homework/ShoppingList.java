package session8.homework;

/**
 * 1. Create a shopping list with Array and print the values
 */

public class ShoppingList {

    public static void main(String[] args) {
        String[] shoppingList = {"Apples", "Tomatoes", "Bananas"};

        for( int index = 0; index < shoppingList.length; index++){
            System.out.print(shoppingList[index] + " ");
        }
    }
}