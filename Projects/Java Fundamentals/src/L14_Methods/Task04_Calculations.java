package L14_Methods;

import java.util.Scanner;

public class Task04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
         and on the next two lines receives two numbers.
         Create four methods (for each calculation) and invoke the right one depending on the command.
         The method should also print the result (it needs to be void).

         */
        String inputOperator = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (inputOperator) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
            default:
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        if (b > 0) {
            System.out.println(a / b);
        }
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }
}
