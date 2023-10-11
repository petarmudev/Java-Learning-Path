package L14_Methods;

import java.util.Scanner;

public class Task05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a method that calculates the total price of an order and prints it on the console.
        The method should receive one of the following products:
            coffee, water, coke, snacks, and a quantity of the product.

        The prices for a single piece of each product are:
            ⦁	"coffee" – 1.50
            ⦁	"water" – 1.00
            ⦁	"coke" – 1.40
            ⦁	"snacks" – 2.00
        Print the result rounded to the second decimal place.
         */
        String orderItem = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        calculateOrder(orderItem, quantity);
    }

    public static void calculateOrder(String item, int quantity) {
        double total = 0;
        switch (item) {
            case "coffee":
                total = 1.5 * quantity;
                break;
            case "water":
                total = 1 * quantity;
                break;
            case "coke":
                total = 1.4 * quantity;
                break;
            case "snacks":
                total = 2 * quantity;
                break;
            default:
                break;
        }
        System.out.printf("%.2f", total);
    }
}
