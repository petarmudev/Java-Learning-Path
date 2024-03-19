package L09_InterfacesAndAbstraction.Task05_BorderControl.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        List<Identifiable> entries = new ArrayList<>();

        while (!command.equals("End")) {
            String[] commandParts = command.split("\\s+");

            String id;
            if (commandParts.length > 2) {
                //"{name} {age} {id}" for citizens
                String name = commandParts[0];
                int age = Integer.parseInt(commandParts[1]);
                id = commandParts[2];
                Citizen citizen = new Citizen(name, age, id);
                entries.add(citizen);
            } else if (commandParts.length == 2) {
                //"{model} {id}" for robots.
                String model = commandParts[0];
                id = commandParts[1];
                Robot robot = new Robot(id, model);
                entries.add(robot);
            }
            command = scanner.nextLine();
        }
        //Receive single number representing the last digits of fake ids
        String fakeId = scanner.nextLine();

        //Print the fake ids
        entries.forEach(entry -> {
            if (entry.getId().endsWith(fakeId)) {
                System.out.printf("%s%n", entry.getId());
            }
        });
    }
}
