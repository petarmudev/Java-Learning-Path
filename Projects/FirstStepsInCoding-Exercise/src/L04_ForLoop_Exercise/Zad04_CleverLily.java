package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine()); //1...77 Age
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());  //1.00...10 000.00 Washing Machine
        int toyPrice = Integer.parseInt(scanner.nextLine());  //0...40 ToyPrice

        int toysCount = 0;
        int moneyReceived = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyReceived += ((i / 2) * 10) - 1;
            } else toysCount += 1;
        }
        double totalSavedMoney = (toysCount * toyPrice) + moneyReceived;
        if (totalSavedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalSavedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - totalSavedMoney);
        }

    }
}
