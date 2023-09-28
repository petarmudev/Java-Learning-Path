package L05_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad11_MultiplicationTable_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            /*
    Rewrite your program, so it can receive the multiplier from the console.
    Print the table from the given multiplier to 10.
    If the given multiplier is more than 10 - print only one row with the integer, the given multiplier, and the product.
    See the examples below for more information.
            Output
    Print every row of the table in the following format:
        {theInteger} X {times} = {product}
            Constraints
    •	The integer will be in the interval [1…100]
    */

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", number, multiplier, number * multiplier);
            multiplier++;
        } while (multiplier <= 10);
    }
}
