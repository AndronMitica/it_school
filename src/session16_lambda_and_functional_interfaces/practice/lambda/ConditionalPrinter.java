package session16_lambda_and_functional_interfaces.practice.lambda;
@FunctionalInterface
public interface ConditionalPrinter {

    void print(String input, boolean condition);
}
