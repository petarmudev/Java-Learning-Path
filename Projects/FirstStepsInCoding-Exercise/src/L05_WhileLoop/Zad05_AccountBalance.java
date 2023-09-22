package L05_WhileLoop;

import java.util.Scanner;

public class Zad05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double num = 0;
        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            num = Double.parseDouble(input);
            if (num < 0) {
                System.out.printf("%nInvalid operation!");
                break;
            }
            sum += num;

            System.out.printf("%nIncrease: %.2f" , num);
            input = scanner.nextLine();
        }
        System.out.printf("%nTotal: %.2f", sum);


    }
}
