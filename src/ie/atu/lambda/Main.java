package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        MathOperation addition =  new Addition();
        StringOperation toUpperCase = new ToUpperCase();

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Apply uppercase: " + toUpperCase.apply("hello world") );
    }
}
