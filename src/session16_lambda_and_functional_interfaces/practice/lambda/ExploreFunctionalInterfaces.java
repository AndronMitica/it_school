package session16_lambda_and_functional_interfaces.practice.lambda;

import java.util.function.Function;

public class ExploreFunctionalInterfaces {

    public static void main(String[] args) {
        Function<String,Integer> stringLengthFinder = str -> str.length();
        System.out.println(stringLengthFinder.apply("Hello world"));
    }
}