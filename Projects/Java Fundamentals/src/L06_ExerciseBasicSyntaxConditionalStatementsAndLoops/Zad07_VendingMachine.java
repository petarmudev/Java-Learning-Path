package L06_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Your task is to calculate the total purchase price from a vending machine.
        Until you receive "Start" you will be given different coins that are being inserted into the machine.
        You have to sum them to have the total money inserted. There is a problem though.
        Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.
        If someone tries to insert some other coins, you have to display "Cannot accept {money}"
        , where the value is formatted to the second digit after the decimal point and not add it to the total money.
        On the next few lines until you receive "End" you will be given products to purchase.
        Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
        If the person tries to purchase a not existing product, print "Invalid product".
        Be careful that the person may try to purchase a product for which he doesn't have money.
        In that case, print "Sorry, not enough money". If the person purchases a product successfully print "Purchased {product name}".
        After the "End" command, print the money that is left formatted to the second decimal point in the format "Change: {money left}".
         */

        String input = scanner.nextLine(); // или е дробно число(под формата на текст) или е текст
        double totalSum = 0;
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                //todo
                totalSum += coin;

            } else //невалидна монета(сума)
                System.out.printf("Cannot accept %.2f%n", coin);
            input = scanner.nextLine();
        }
        //до тук е пускането на монети и проверка дали са валидни

        //от тук се въвеждат продукти, докато не е End. Продуктите са Nuts | Water | Crisps | Soda | Coke
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":  //price 2.00
                    if (totalSum >= 2) {
                        System.out.println("Purchased Nuts");
                        totalSum -= 2;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Water": //price 0.70
                    if (totalSum >= 0.70) {
                        System.out.println("Purchased Water");
                        totalSum -= 0.70;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Crisps": //price 1.50
                    if (totalSum >= 1.50) {
                        System.out.println("Purchased Crisps");
                        totalSum -= 1.50;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Soda":  //price 0.80
                    if (totalSum >= 0.80) {
                        System.out.println("Purchased Soda");
                        totalSum -= 0.80;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Coke": //price 1.0
                    if (totalSum >= 1.0) {
                        System.out.println("Purchased Coke");
                        totalSum -= 1.0;
                    } else System.out.println("Sorry, not enough money");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalSum);
    }
}
