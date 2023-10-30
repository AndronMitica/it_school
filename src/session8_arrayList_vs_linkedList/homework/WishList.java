package session8_arrayList_vs_linkedList.homework;

import java.util.ArrayList;

/**
 * 2. Create a wishlist for christmas with ArrayList and print the values
 */
public class WishList {

    public static void main(String[] args) {
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("Toys");
        wishList.add("Sweets");
        wishList.add("Board games");
        wishList.add("Books");

        System.out.println(wishList);
    }
}