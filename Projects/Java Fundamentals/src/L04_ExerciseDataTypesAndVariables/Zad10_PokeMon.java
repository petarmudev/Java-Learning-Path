package L04_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 входни данни
        int power = Integer.parseInt(scanner.nextLine()); //текуща (N)
        int distance = Integer.parseInt(scanner.nextLine()); //разстояние между целите (M)
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); // (Y)

        int countPoked = 0;
        int startedPower = power;
        //Повтаряме: Намушкване
        //1. Стигаме до целта
        //2. Извършваме действието

        //Стоп: сила < разстояние
        //продължава: сила >= разстоянието
        while (power >= distance) {
            power -= distance;
            countPoked++;

            //проверка за умората
            if (power == startedPower / 2) {
                if (exhaustionFactor != 0) {
                    power /= exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoked);
    }
}
