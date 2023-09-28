package session18.problem_7;

import java.util.ArrayList;

public class MainPair {
    public static void main(String[] args) {

        Pair <StringBuilder, ArrayList> pair = new Pair<>(new StringBuilder("a"), new ArrayList<>());

        pair.getKey().append("b");
        pair.getValue().add("something");

        System.out.println(pair);
    }
}