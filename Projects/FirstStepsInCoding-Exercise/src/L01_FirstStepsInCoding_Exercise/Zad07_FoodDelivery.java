package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ресторант отваря врати и предлага няколко менюта на преференциални цени:
        //Пилешко меню –  10.35 лв.
        //Меню с риба – 12.40 лв.
        //Вегетарианско меню  – 8.15 лв.
        //Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.

        //Вход
        //От конзолата се четат 3 реда:
        //Брой пилешки менюта – цяло число в интервала [0 … 99]
        //Брой менюта с риба – цяло число в интервала [0 … 99]
        //Брой вегетариански менюта – цяло число в интервала [0 … 99]

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double delivery = 2.50;

        double chickenTotal = chickenMenus * 10.35;
        double fishTotal = fishMenus * 12.40;
        double vegetarianTotal = vegetarianMenus * 8.15;
        double desert = (chickenTotal + fishTotal + vegetarianTotal) * 0.2;

        double totalMenusSum = chickenTotal + fishTotal + vegetarianTotal;

        System.out.println(totalMenusSum + desert + delivery);
    }

}
