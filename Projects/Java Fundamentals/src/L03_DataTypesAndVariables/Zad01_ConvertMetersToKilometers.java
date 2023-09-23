package L03_DataTypesAndVariables;

import java.util.Scanner;

public class Zad01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", meters/1000.0); //convert meters to kilometers
    }
}
