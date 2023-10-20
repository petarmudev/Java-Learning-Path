package L19_ExamPreparation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Link: https://judge.softuni.org/Contests/Practice/Index/2517#0

        Write a program that prints you a receipt for your new computer. You will receive the parts' prices (without tax),
        until you receive what type of customer this is - special or regular.
        Once you receive the type of customer you should print the receipt.
        The taxes are 20% of each part's price you receive.
        If the customer is special, he has a 10% discount on the total price with taxes.
        If a given price is not a positive number, you should print "Invalid price!" on the console and
        continue with the next price.
        If the total price is equal to zero, you should print "Invalid order!" on the console.
         */

        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price > 0) {
                totalPrice += price;
            } else {
                System.out.println("Invalid price!");
            }


            input = scanner.nextLine();
        }
        double taxes = totalPrice * 0.2;
        double result = totalPrice + taxes;

        if (totalPrice == 0) {
            System.out.printf("Invalid order!");

        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");


            if (input.equals("regular")) {
                System.out.printf("Total price: %.2f$%n", result);

            } else if (input.equals("special")) {
                result *= 0.9;
                System.out.printf("Total price: %.2f$%n", result);
            }
        }
    }
}

