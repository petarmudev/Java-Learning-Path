package L03_ConditionalStatementsAdvanced_Excercise;

import java.util.Scanner;

public class Zad02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2.  Лятно облекло
        //Лято е с много променливо време и Виктор има нужда от вашата помощ. Напишете програма, която спрямо времето от денонощието и градусите
        // да препоръча на Виктор какви дрехи да си облече.
        // Вашия приятел има различни планове за всеки етап от деня, които изискват и различен външен вид, тях може да видите от таблицата.
        //  От конзолата се четат точно два реда:
        //      Градусите - цяло число в интервала [10…42]
        //      Текст, време от денонощието - с възможности - "Morning", "Afternoon", "Evening"

        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            switch (partOfTheDay) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }

        } else if (degrees < 25) {
            switch (partOfTheDay) {
                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else {
            switch (partOfTheDay) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
