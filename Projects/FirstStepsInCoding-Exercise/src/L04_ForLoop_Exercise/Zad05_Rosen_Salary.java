package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad05_Rosen_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int forfeit = 0;  //Globata (payCut в моето решение)

        for (int i = 1; i <= n; i++) {

            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook"))
                forfeit += 150;
            else if (siteName.equals("Instagram"))
                forfeit += 100;
            else if (siteName.equals("Reddit"))
                forfeit += 50;

            if (forfeit >= salary) {
                System.out.println("You have lost your salary.");
                break;                                               // <--ТУК Е ВАЖНИЯ МОМЕНТ В РЕШЕНИЕТО
            }
        }
        if (salary > forfeit)
            System.out.printf("%d", salary - forfeit);
    }
}
