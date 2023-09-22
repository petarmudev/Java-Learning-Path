import java.util.Scanner;

public class Zad04_Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kilometres = Double.parseDouble(scanner.nextLine());
        double percentage = 0;
        double sumOfAllDays = kilometres;
        for (int i = 0; i < days; i++) {
            percentage = Double.parseDouble(scanner.nextLine());
            kilometres += kilometres * (percentage/100);
            sumOfAllDays +=kilometres;

        }
        double diff = 1000 - sumOfAllDays;
        if (sumOfAllDays >= 1000) {
            sumOfAllDays = Math.ceil(sumOfAllDays);
            System.out.printf("You've done a great job running %.0f more kilometers!", sumOfAllDays - 1000);
        } else if (sumOfAllDays < 1000) {
            sumOfAllDays = Math.floor(sumOfAllDays);
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", 1000 - sumOfAllDays);
        }
    }
}