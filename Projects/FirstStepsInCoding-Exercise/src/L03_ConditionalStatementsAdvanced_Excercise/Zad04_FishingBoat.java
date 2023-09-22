package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4. Лодка за риболов
        //Тони и приятели много обичали да ходят за риба, те са толкова запалени по риболова, че решават да отидат на риболов с кораб. Цената за наема на кораба зависи от сезона и броя рибари.
        //Цената зависи от сезона:
        //      Цената за наем на кораба през пролетта е  3000 лв.
        //      Цената за наем на кораба през лятото и есента е  4200 лв.
        //      Цената за наем на кораба през зимата е  2600 лв.
        //В зависимост от броя си групата ползва отстъпка:
        //      Ако групата е до 6 човека включително  –  отстъпка от 10%.
        //      Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
        //      Ако групата е от 12 нагоре  –  отстъпка от 25%.
        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
        //Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.

        //      Вход
        //  От конзолата се четат точно три реда.
        //      Бюджет на групата – цяло число в интервала [1…8000]
        //      Сезон –  текст : "Spring", "Summer", "Autumn", "Winter"
        //      Брой рибари – цяло число в интервала [4…18]

        int budget = Integer.parseInt(scanner.nextLine());  //[1…8000]
        String season = scanner.nextLine();  //"Spring", "Summer", "Autumn", "Winter"
        int fishermanCount = Integer.parseInt(scanner.nextLine());  //[4…18]

        double totalPrice = 0;

        switch (season) {
            case "Spring":  //3000
                totalPrice = 3000;
                if (fishermanCount >= 1 && fishermanCount < 7) {
                    totalPrice *= 0.90;
                } else if (fishermanCount < 12) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.75;
                }
                break;
            case "Summer":
            case "Autumn": //4200
                totalPrice = 4200;
                if (fishermanCount >= 1 && fishermanCount < 7) {
                    totalPrice *= 0.90;
                } else if (fishermanCount < 12) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.75;
                }
                break;
            case "Winter":  //2600
                totalPrice = 2600;
                if (fishermanCount >= 1 && fishermanCount < 7) {
                    totalPrice *= 0.90;
                } else if (fishermanCount < 12) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.75;
                }
                break;
        }
        //      Изход
        //  Да се отпечата на конзолата един ред:
        //      Ако бюджетът е достатъчен:
        //          "Yes! You have {останалите пари} leva left."
        //      Ако бюджетът НЕ Е достатъчен:
        //          "Not enough money! You need {сумата, която не достига} leva."
        //Сумите трябва да са форматирани с точност до два знака след десетичната запетая.
        if (fishermanCount % 2 == 0 && !season.equals("Autumn")) {
            totalPrice *= 0.95;
        }
        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
