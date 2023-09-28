package L08_DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class Zad03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Write a program to enter n numbers and calculate and print their exact sum (without rounding).
        Examples
        Input	                Output
        ------------------------------------------------
        3                       1000000000000000015
        1000000000000000000
        5
        10
        -------------------------------------------------
        2                       333333333333.30000000003
        0.00000000003
        333333333333.3
        -------------------------------------------------
             Hints:
            Use BigDecimal not to lose precision.
        */
        int howManyNumbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < howManyNumbers; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
