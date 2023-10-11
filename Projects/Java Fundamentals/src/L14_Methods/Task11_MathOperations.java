package L14_Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a method that receives two numbers and an operator, calculates the result, and returns it.
        You will be given three lines of input.
            The first will be the first number,
            the second one will be the operator,
            and the last one will be the second number.
            The possible operators are: / * + -
        Print the result rounded up to the second decimal point.

         */
        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(firstNumber, operator, secondNumber));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                if (b > 0) {
                    result = a / b;
                }
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            default:
                break;
        }
        return result;
    }
}

