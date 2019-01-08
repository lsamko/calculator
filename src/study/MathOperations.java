package study;

public class MathOperations {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("It's prohibited to divide by 0");
        }
        return c;
    }
}
