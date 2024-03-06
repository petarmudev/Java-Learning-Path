package L10_Exercise_InterfacesAndAbstraction.Task03_BirthdayCelebrations.birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Birthable> birthableList = new ArrayList<>();


        while (!"End".equals(input)) {
            String[] inputParts = input.split("\\s+");
            String typeToCreate = inputParts[0];
            switch (typeToCreate) {
                case "Citizen":
                    String citizenName = inputParts[1];
                    int age = Integer.parseInt(inputParts[2]);
                    String id = inputParts[3];
                    String citizenBirthDate = inputParts[4];
                    Citizen citizen = new Citizen(citizenName, age, id, citizenBirthDate);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    String petName = inputParts[1];
                    String petBirthDate = inputParts[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    birthableList.add(pet);
                    break;
                case "Robot":
                    String model = inputParts[1];
                    String robotId = inputParts[2];
                    Robot robot = new Robot(robotId, model);
                    break;
            }
            input = scanner.nextLine();
        }
        String yearToFind = scanner.nextLine();
        //Option 1:
//      for (Birthable entry : birthableList) {
//          if (entry.getBirthDate().endsWith(year)) {
//              System.out.println(entry.getBirthDate());
//          }
//      }
        //Option 2:
        birthableList.stream()
                .filter(entry -> entry.getBirthDate().endsWith(yearToFind))
                .forEach(e -> System.out.println(e.getBirthDate()));

    }
}