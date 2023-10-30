package session16_lambda_and_functional_interfaces.practice.lambda;

public class TestGreetingService {


    public static void main(String[] args) {
        GreetingService anonymusGreetingService = new GreetingService() {
            @Override
            public void greeting(String message) {
                System.out.println("Hello" + " ");
            }
        };
        anonymusGreetingService.greeting("Ionut");
        // lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello" + message);
        lambdaGreetingService.greeting("Maria");
    }
}