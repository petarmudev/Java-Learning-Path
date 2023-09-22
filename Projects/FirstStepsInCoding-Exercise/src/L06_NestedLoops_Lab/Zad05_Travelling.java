package L06_NestedLoops_Lab;

import java.util.Scanner;

public class Zad05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {

            double neededMoney = Double.parseDouble(scanner.nextLine()); // нужни пари за дестинацията.
            //спестяваме...
            double savedMoney = 0; //спестени пари
            while (savedMoney < neededMoney) {
                double sumToSave = Double.parseDouble(scanner.nextLine());
                savedMoney += sumToSave;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();

        }
    }
}
