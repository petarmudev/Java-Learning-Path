package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfOpenTabs = Integer.parseInt(scanner.nextLine()); //1...10
        int salary = Integer.parseInt(scanner.nextLine());  //500...1500

        int payCut = 0;

        for (int i = 0; i < numOfOpenTabs; i++) {
            String tabName = scanner.nextLine();
            switch (tabName) {
                case "Facebook":
                    payCut += 150;
                    break;
                case "Instagram":
                    payCut += 100;
                    break;
                case "Reddit":
                    payCut += 50;
                    break;
            }
        }
        if (payCut >= salary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", salary - payCut);
        }

    }
}
