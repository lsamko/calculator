package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Hello! Press enter");
        while ((line = br.readLine()) != null && !line.equalsIgnoreCase("Q")) {

            int num1 = getInt();
            char operation = getOperation();
            int num2 = getInt();
            int result = calc(num1, operation, num2);
            System.out.println("Result : " + result);
            System.out.println("For exit enter Q. Press enter to continue.");
        }
        if (line.equalsIgnoreCase("q")){
            System.out.println("Bye-Bye!");
        }
    }

    private static int getInt() {
        System.out.println("Enter number: ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    private static char getOperation() {
        System.out.println("Enter operation  '+', '-', ' *',  or '/': ");

        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);

        } else {
            System.out.println("Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }


    private static int calc(int num1, char operation, int num2) {
        int result;

        switch (operation) {

            case '+':
                result = MathOperations.sum(num1, num2);
                break;

            case '-':
                result = MathOperations.min(num1, num2);

                break;
            case '*':
                result = MathOperations.multiply(num1, num2);
                break;
            case '/':
                result = MathOperations.divide(num1, num2);
                break;

            default:
                System.out.println("Try again");
                result = calc(num1, getOperation(), num2);
        }
        return result;

    }
}





