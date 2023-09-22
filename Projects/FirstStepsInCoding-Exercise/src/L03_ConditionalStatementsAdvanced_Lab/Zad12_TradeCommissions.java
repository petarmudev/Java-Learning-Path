package L03_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Zad12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Фирма дава следните комисионни на търговците си според града, в който работят и обема на продажбите s
            Град    0 ≤ s ≤ 500   |  500 < s ≤ 1 000   |  1 000 < s ≤ 10 000   |   s > 10 000
            Sofia       5%        |       7%           |          8%           |       12%
            Varna       4.5%      |       7.5%         |          10%          |       13%
            Plovdiv     5.5%      |       8%           |          12%          |       14.5%

            Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число), въведени от потребителя
            и изчислява и извежда размера на търговската комисионна, според горната таблица.
            Резултатът да се изведе форматиран до 2 цифри след десетичната точка.
            При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".
         */

        String town = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());

        if (!town.equals("Sofia") || !town.equals("Varna") || !town.equals("Plovdiv")) {
            System.out.println("Error");
        }
        if (town.equals("Sofia")){

        }


    }
}
