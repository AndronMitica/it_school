package session16_lambda_and_functional_interfaces.practice.lambda;
@FunctionalInterface
public interface StringProcessor {
    String process(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
