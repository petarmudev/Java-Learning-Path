package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
                We are placing N orders at a time. You need to calculate the price on the following formula:
            ((daysInMonth * capsulesCount) * pricePerCapsule)
                Input / Constraints
            •	On the first line, you will receive integer N – the count of orders the shop will receive.
            •	For each order, you will receive the following information:
                o	Price per capsule - floating-point number in the range [0.00…5000.00].
                o	Days – integer in the range [1…31].
                o	Capsules count - integer in the range [0…7000000].
        The input will be in the described format, there is no need to check it explicitly.

            Output
        The output should consist of N + 1 line. For each order, you must print a single line in the following format:
            •	"The price for the coffee is: ${price}"
        On the last line, you need to print the total price in the following format:
            •	 "Total: ${totalPrice}"
        The price must be formatted to 2 decimal places.

        */

        int orders = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 0; i < orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double price = ((daysInMonth * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", price);
            totalSum += price;
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}
