package session16_lambda_and_functional_interfaces.practice.lambda;

@FunctionalInterface
public interface Calculator {

    double calculate(double a, double b, char operator);
}
