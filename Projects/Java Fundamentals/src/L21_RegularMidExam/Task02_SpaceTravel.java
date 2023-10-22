package L21_RegularMidExam;

import java.util.Scanner;

public class Task02_SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {
            String command = input[i].split(" ")[0];
            int amount = 0;
            switch (command) {
                case "Travel":
                    amount = Integer.parseInt(input[i].split(" ")[1]);
                    fuel -= amount;
                    if (fuel >= amount) {
                        System.out.printf("The spaceship travelled %d light-years.%n", amount);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;

                case "Enemy":
                    amount = Integer.parseInt(input[i].split(" ")[1]);
                    if (ammunition >= amount) {
                        ammunition -= amount;
                        System.out.printf("An enemy with %d armour is defeated.%n", amount);
                    } else if (ammunition < amount && fuel >= amount * 2) {
                        fuel -= amount * 2;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", amount);
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;

                case "Repair":
                    amount = Integer.parseInt(input[i].split(" ")[1]);
                    fuel += amount;
                    ammunition += amount * 2;
                    System.out.printf("Ammunitions added: %d.%n", amount * 2);
                    System.out.printf("Fuel added: %d.%n", amount);
                    break;

                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    break;

                default:
                    break;
            }
        }
    }
}
