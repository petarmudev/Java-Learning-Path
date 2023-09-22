package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме 3 реда:
        // Депозирана сума; Срок на депозит; ГЛП;
        //2. Пресмятаме печалбата за месец.
        //3. Пресмятаме колко е цялата сума за всички месеци.
        //4. Принтираме резултата.

        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositMonths = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double profitPerMonth = (depositSum  * (interestRate / 100))/12;

        double totalSum = depositSum + profitPerMonth * depositMonths;
        System.out.println(totalSum);

    }
}
