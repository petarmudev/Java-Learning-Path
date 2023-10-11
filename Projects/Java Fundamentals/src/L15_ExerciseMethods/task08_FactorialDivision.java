package L15_ExerciseMethods;

import java.util.Scanner;

public class task08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read two integer numbers. Calculate the factorial of each number.
        Divide the first result by the second and print the division formatted to the second decimal point.
        */
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", (calculateFactorial(firstNumber) * 1.0) / calculateFactorial(secondNumber));
    }

    //изчисленият фаториел може да е много голямо число! Затова го правим с long!
    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
