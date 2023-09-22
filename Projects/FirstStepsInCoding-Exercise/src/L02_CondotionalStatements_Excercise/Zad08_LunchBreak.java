package L02_CondotionalStatements_Excercise;

import java.util.Scanner;

public class Zad08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int lunchBrakeTime = Integer.parseInt(scanner.nextLine());

        double timeForEat = lunchBrakeTime / 8.0;
        double timeForRest = lunchBrakeTime / 4.0;

        double timeForWatching = lunchBrakeTime - timeForEat - timeForRest;

        if (timeForWatching >= duration){

            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, Math.ceil(timeForWatching - duration));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, Math.ceil(duration - timeForWatching));
        }


    }
}
