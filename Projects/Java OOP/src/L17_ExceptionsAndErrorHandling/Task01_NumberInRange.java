package L17_ExceptionsAndErrorHandling;

import java.util.Scanner;

public class Task01_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split("\\s+");

        int startOfRange = Integer.parseInt(range[0]);
        int endOfRange = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]%n", startOfRange, endOfRange);
        int validNumber = readValidNumber(scanner, startOfRange, endOfRange);
        System.out.println("Valid number: " + validNumber);
    }

    private static int readValidNumber(Scanner scanner, int startOfRange, int endOfRange) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int inputNumber = Integer.parseInt(input);
                if (inputNumber >= startOfRange && inputNumber <= endOfRange) {
                    return inputNumber;
                }
            } catch (NumberFormatException exception) {

            }
            System.out.println("Invalid number: " + input);
        }
    }
}
