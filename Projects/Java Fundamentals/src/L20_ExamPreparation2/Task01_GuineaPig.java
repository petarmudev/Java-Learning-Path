package L20_ExamPreparation2;

import java.util.Scanner;

public class Task01_GuineaPig {
    public static void main(String[] args) {
        // https://judge.softuni.org/Contests/Practice/Index/2031#0
        Scanner scanner = new Scanner(System.in);
        double foodInKg = Double.parseDouble(scanner.nextLine());
        double hayInKgMonth = Double.parseDouble(scanner.nextLine());
        double coverInKg = Double.parseDouble(scanner.nextLine());
        double pigWeightKg = Double.parseDouble(scanner.nextLine());

        double foodInGrams = foodInKg * 1000;
        double hayInGrams = hayInKgMonth * 1000;
        double coverInGrams = coverInKg * 1000;
        double pigWeightGrams = pigWeightKg * 1000;

        for (int day = 1; day <= 30; day++) {
            //всеки ден яде по 300 гр.
            foodInGrams -= 300;
            if (day % 2 == 0) {
                hayInGrams -= foodInGrams * 0.05;
            }
            if (day % 3 == 0) {
                double coverInGramsNeeded = pigWeightGrams / 3;
                coverInGrams -= coverInGramsNeeded;
            }
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);

    }
}
