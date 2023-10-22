package L21_RegularMidExam;

import java.util.Scanner;

public class Task02_V2SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {
            String command = input[i].split(" ")[0];
            if (command.equals("Titan")) {
                System.out.println("You have reached Titan, all passengers are safe.");
                return;
            } else {
                int amount = Integer.parseInt(input[i].split(" ")[1]);

                if (command.equals("Travel")) {
                    if (fuel >= amount) {
                        fuel -= amount;
                        System.out.printf("The spaceship travelled %d light-years.%n", amount);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }

                } else if (command.equals("Enemy")) {
                    if (ammunition >= amount) {
                        ammunition -= amount;
                        System.out.printf("An enemy with %d armour is defeated.%n", amount);
                    } else if (fuel >= amount * 2) {
                        fuel -= (amount * 2);
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", amount);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }

                } else if (command.equals("Repair")) {
                    fuel += amount;
                    ammunition += (amount * 2);
                    System.out.printf("Ammunitions added: %d.%n", amount * 2);
                    System.out.printf("Fuel added: %d.%n", amount);
                }
            }
        }
    }
}

