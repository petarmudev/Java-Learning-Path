package L03_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Zad11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Магазин за плодове през работните дни работи на следните цени:
        плод banana apple orange grapefruit kiwi pineapple grapes
        цена  2.50  1.20   0.85     1.45    2.70  5.50      3.85
         */

        /* Събота и неделя магазинът работи на по-високи цени
        плод banana apple orange grapefruit kiwi pineapple grapes
        цена  2.70  1.25   0.90     1.60    3.00    5.60    4.20
         */
        /*Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
         ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
         и количество (десетично число) , въведени от потребителя, и пресмята цената според
         цените от таблиците по-горе. При невалиден ден от седмицата или невалидно име на плод да се отпечата "error". */


        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.70;
                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3.00;
                        break;
                    case "pineapple":
                        price = 5.60;
                        break;
                    case "grapes":
                        price = 4.20;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;

        }
        double totalPrice = quantity * price;
        if (price != 0) {
            System.out.printf("%.2f", totalPrice);
        }
    }
}
