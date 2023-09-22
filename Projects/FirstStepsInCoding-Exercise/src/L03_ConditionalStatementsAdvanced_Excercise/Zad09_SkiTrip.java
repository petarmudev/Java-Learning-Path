package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (nights < 10) {
                    price = price * 0.70;
                } else if (nights < 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                if (nights < 10) {
                    price = price * 0.90;
                } else if (nights < 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.8;
                }
                break;
        }
        if (assessment.equals("positive")) {
            price = price * 1.25;
        } else if (assessment.equals("negative")) {
            price = price * 0.90;
        }

        System.out.printf("%.2f", price * nights);

    }
}
