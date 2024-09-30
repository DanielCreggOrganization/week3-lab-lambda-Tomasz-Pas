package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        StringOperation toUpperCase = (a) -> a.toUpperCase();
        Runnable task = () -> System.out.println("Hello from the thread");
        Calculator square = (int x) -> x * x;
        Function<String, String> trim = s -> s.trim();
        Function<String, String> replaceSpaces = s -> s.replace(" ", "-");
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        Function<String, String> combinedOperation = trim.andThen(replaceSpaces).andThen(toLowerCase);

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Apply uppercase: " + toUpperCase.apply("hello world"));
        Thread thread = new Thread(task);
        thread.start();
        int result = square.calculation(7);
        System.out.println("Square of 7 is: " + result);

        String ans = combinedOperation.apply("Hello World From TOMASZ");
        System.out.println("Result: " + ans);
    }
}
