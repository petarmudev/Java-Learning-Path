package L19_ExamPreparation;

import java.util.Scanner;

public class Task02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Link: https://judge.softuni.org/Contests/Practice/Index/2028#1
         */
        int health = 100;
        int bitcoins = 0;
        String[] stringRooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < stringRooms.length; i++) {
            String command = stringRooms[i].split(" ")[0];
            int number = Integer.parseInt(stringRooms[i].split(" ")[1]);
            if (command.equals("potion")) { //health 80;potion 30
                int healed = Math.min((100 - health), number);
                health += healed;
                System.out.printf("You healed for %d hp.%n", healed);
                System.out.printf("Current health: %d hp.%n", health);

            } else if (command.equals("chest")) {
                //todo bitcoins
                System.out.printf("You found %d bitcoins.%n", number);
                bitcoins += number;

            } else {
                //todo fighting monsters
                if ((health - number) > 0) {
                    System.out.printf("You slayed %s.%n", command);
                    health -= number;
                } else {
                    //todo room counter
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d", i + 1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d%n", health);

    }
}
