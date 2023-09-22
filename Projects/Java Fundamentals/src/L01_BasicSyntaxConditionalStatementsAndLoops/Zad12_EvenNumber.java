package L01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            /*Take as an input an even number and print its absolute value with a message: "The number is: {absoluteValue}". If the number is odd, print "Please write an even number." and continue reading numbers.
    Examples
    Input	Output                      		Input	Output
    1       Please write an even number.        -6	    The number is: 6
    3       Please write an even number.
    6       The number is: 6
        */

        boolean isEvenFound = false;
        while (!isEvenFound) {
            int number = Math.abs(Integer.parseInt(scanner.nextLine()));
            if (number % 2 == 0) {
                isEvenFound = true;
                System.out.printf("The number is: %d", number);
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
