package L21_RegularMidExam;

import java.util.Scanner;

public class Task01_ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double expNeeded = Double.parseDouble(scanner.nextLine());
        int coundBattles = Integer.parseInt(scanner.nextLine());
        double expEarned = 0;
        double totalExp = 0;
        int counter = 0;
        for (int i = 1; i <= coundBattles; i++) {
            expEarned = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0) {
                expEarned *= 1.15;
            }
            if (i % 5 == 0) {
                expEarned *= 0.9;
            }
            if (i % 15 == 0) {
                expEarned *= 1.05;
            }
            totalExp += expEarned;
            if (totalExp >= expNeeded) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", expNeeded - totalExp);
    }
}
