package L02_CondotionalStatements_Excercise;

import java.util.Scanner;

public class Zad02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (num <= 100) {
            bonusPoints = 5;
        } else if (num <= 1000) {
            bonusPoints = num / 5;
        } else {
            bonusPoints = num / 10;
        }

        if (num % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        } else if (num % 5 == 0) {
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(num + bonusPoints);
    }
}
