package L02_CondotionalStatements_Excercise;

import java.util.Scanner;

public class Zad07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
         Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка. Важат следните цени:
        Видеокарта – 250 лв./бр.
                Процесор – 35% от цената на закупените видеокарти/бр.
                Рам памет – 10% от цената на закупените видеокарти/бр.
                Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.*/

        /*    Вход
        Входът се състои от четири реда:
        1. Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        2. Броят видеокарти - цяло число в интервала [0…100]
        3. Броят процесори - цяло число в интервала [0…100]
        4. Броят рам памет - цяло число в интервала [0…100]
        */

        double budget = Double.parseDouble(scanner.nextLine());
        int nCountVideoCard = Integer.parseInt(scanner.nextLine());
        int mCountProcessors = Integer.parseInt(scanner.nextLine());
        int pCountRAM = Integer.parseInt(scanner.nextLine());

        double priceVideoCard = nCountVideoCard * 250;
        double priceProcessor = mCountProcessors * (priceVideoCard * 0.35);
        double priceRAM = pCountRAM * (priceVideoCard * 0.10);

        double totalSum = priceVideoCard + priceProcessor + priceRAM;

        if (nCountVideoCard > mCountProcessors) {
            totalSum = totalSum * 0.85; // totalSum - (totalSum * 0.15);

        }
        double diff = Math.abs(totalSum - budget);
        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }


    }
}
