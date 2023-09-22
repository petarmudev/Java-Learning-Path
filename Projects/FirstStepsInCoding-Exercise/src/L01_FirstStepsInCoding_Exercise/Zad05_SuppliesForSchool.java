package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме 4 числа - брой химикали, маркери, литри препарат и процент намаление.
        //2. Да изчислим колко пари ще трябва да събере Ани, за да плати сметката, като имате предвид следния ценоразпис:
        // Пакет химикали 5.80, маркери 7.20; Препарат - 1.20лв/л.
        //3. Да пресметнем отстъпка: обща сума ->отстъпката на база %, който сме прочели.
        //4. Да пресметнем общата сума.
        //5. Принтираме.
        //---------------------------------
        //1. Прочитаме 4 числа - брой химикали, маркери, литри препарат и процент намаление.
        int pensPackages = Integer.parseInt(scanner.nextLine());
        int highlighterPackages = Integer.parseInt(scanner.nextLine());
        int cleaningAgentLitres = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        //2. Да изчислим колко пари ще трябва да събере Ани, за да плати сметката, като имате предвид следния ценоразпис:
        // Пакет химикали 5.80, маркери 7.20; Препарат - 1.20лв/л.
        double penPrice = pensPackages * 5.8;
        double highlighterPrice = highlighterPackages * 7.20;
        double cleaningAgentPrice = cleaningAgentLitres * 1.20;


        //3. Да пресметнем отстъпка: обща сума ->отстъпката на база %, който сме прочели.

        double sumWithoutDiscount = penPrice + highlighterPrice + cleaningAgentPrice;
        double finalSum = sumWithoutDiscount - (sumWithoutDiscount * ((double) discount / 100));
        System.out.println(finalSum);
    }
}
