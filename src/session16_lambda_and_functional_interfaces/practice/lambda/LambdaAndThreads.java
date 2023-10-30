package session16_lambda_and_functional_interfaces.practice.lambda;

public class LambdaAndThreads {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a separate thread! ");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}