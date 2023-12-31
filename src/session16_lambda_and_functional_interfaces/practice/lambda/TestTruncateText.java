package session16_lambda_and_functional_interfaces.practice.lambda;

public class TestTruncateText {

    public static void main(String[] args) {
        TruncateText truncateText = (input, maxLength) -> input.length() > maxLength ? input.substring(0,maxLength) : input;
        System.out.println(truncateText.truncate("Hello", 5));
    }
}