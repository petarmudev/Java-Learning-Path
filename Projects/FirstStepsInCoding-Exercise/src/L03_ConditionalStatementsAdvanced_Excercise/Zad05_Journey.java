package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /*Странно, но повечето хора си плануват от рано почивката. Млад програмист разполага с определен бюджет и свободно време в даден сезон.
     Напишете програма, която да приема на входа бюджета и сезона, а на изхода да изкарва, къде ще почива програмиста и колко ще похарчи.

    Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг, а зимата в хотел.
    Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или хотел, според дестинацията, има собствена цена,
    която отговаря на даден процент от бюджет*/

    /* · При 100лв. или по-малко – някъде в България:
           o Лято – 30% от бюджета
           o Зима – 70% от бюджета
    · При 1000лв. или по малко – някъде на Балканите:
           o Лято – 40% от бюджета
           o Зима – 80% от бюджета
    · При повече от 1000лв. – някъде из Европа:
           o При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета. */

        double budget = Double.parseDouble(scanner.nextLine());  // 10.00 ... 5000.00
        String season = scanner.nextLine();  // summer or winter
        /*създаваме нови променливи , в които ще запазим:
         *Къде ще почива
         *Какъв тип ше е настаняването
         *Колко е изхарчил */

        String destination = "";
        String accommodationType = "";
        double spendMoney = 0;

        //Правим проверка за бюджета --> <=100 Балканите, всички останали случаи > Европа
        //Проверяваме къде ще почива и кой е сезона.
        if (budget <= 100 && season.equals("summer")) {
            destination = "Bulgaria";
            accommodationType = "Camp";
            spendMoney = budget * 0.3;

           /* //Проверяваме дали е зима или лято
            if (season.equals("summer")) {
                accommodationType = "Camp";
                spendMoney = budget * 0.30;
            } else {
                accommodationType = "Hotel";
                spendMoney = budget * 0.70;
            } */

        } else if (budget <= 100 && season.equals("winter")) { // winter
            destination = "Bulgaria";
            accommodationType = "Hotel";
            spendMoney = budget * 0.70;
        } else if (budget <= 1000 && season.equals("summer")) {
            destination = "Balkans";
            accommodationType = "Camp";
            spendMoney = budget * 0.40;
        } else if (budget <=1000 && season.equals("winter")) {
            destination = "Balkans";
            accommodationType = "Hotel";
            spendMoney = budget * 0.80;
        } else {
            destination = "Europe";
            accommodationType = "Hotel";
            spendMoney = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n", destination); //%n - Нов ред!
        System.out.printf("%s - %.2f", accommodationType, spendMoney);
    }
}
