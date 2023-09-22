package L02_CondotionalStatements_Excercise;

import java.util.Scanner;

public class Zad05_GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        //Пресмятаме колко ще платим за дрехите
        //Пр. колко ще платим за декор
        //Проверяваме дали статистите са повече от 150 > ако са имамме 10% остъпка
        //Пресмятаме общата сума за филма > декора + цента за дрехите
        //Правим проверка дали бюджетът е достатъчен

        double priceForClothes = statistsCount * outfitPrice;
        double priceForDecor = movieBudget * 0.1;

        if (statistsCount > 150){
            priceForClothes = priceForClothes * 0.9;
        }

        double finalSum = priceForClothes + priceForDecor;
        double diff = Math.abs(finalSum - movieBudget);

        if (finalSum > movieBudget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
