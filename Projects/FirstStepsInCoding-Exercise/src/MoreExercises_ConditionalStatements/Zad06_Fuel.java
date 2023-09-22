package MoreExercises_ConditionalStatements;

import java.util.Scanner;

public class Zad06_Fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        int litres = Integer.parseInt(scanner.nextLine());


        if (fuelType.contains("Diesel") || fuelType.contains("Gasoline") || fuelType.contains("Gas")) {
            if (litres >= 25) {
                System.out.printf("You have enough " + fuelType.toLowerCase() + ".");
            }else {
                System.out.printf("Fill your tank with " + fuelType.toLowerCase() + "!");
            }

        } else {
            System.out.println("Invalid fuel!");
        }
    }
}



