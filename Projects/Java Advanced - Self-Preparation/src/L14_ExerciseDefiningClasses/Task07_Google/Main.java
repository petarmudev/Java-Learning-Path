package L14_ExerciseDefiningClasses.Task07_Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // https://softuni.bg/trainings/resources/video/68580/video-28-january-2022-desislava-topuzakova-java-advanced-january-2022/3586
        // Start time - end time: 2:23ч. - 3:20ч.
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();

        Map<String, Person> peopleData = new HashMap<>();
        while (!inputData.equals("End")) {
             /*
                • "{Name} company {companyName} {department} {salary}"
                • "{Name} pokemon {pokemonName} {pokemonType}"
                • "{Name} parents {parentName} {parentBirthday}"
                • "{Name} children {childName} {childBirthday}"
                • "{Name} car {carModel} {carSpeed}"
              */
            String[] parameters = inputData.split("\\s+");
            String name = parameters[0];
            if (!peopleData.containsKey(name)) {
                peopleData.put(name, new Person());
            }

            String typeCommand = parameters[1];
            switch (typeCommand) {
                case "company":
                    String companyName = parameters[2];
                    String department = parameters[3];
                    double salary = Double.parseDouble(parameters[4]);
                    Company company = new Company(companyName, department, salary);
                    peopleData.get(name).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = parameters[2];
                    String pokemonType = parameters[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    peopleData.get(name).getPokemon().add(pokemon);
                    break;
                case "parents":
                    String parentName = parameters[2];
                    String parentBirthday = parameters[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    peopleData.get(name).getParents().add(parent);
                    break;
                case "children":
                    String childName = parameters[2];
                    String childBirthday = parameters[3];
                    Child child = new Child(childName, childBirthday);
                    peopleData.get(name).getChildren().add(child);
                    break;
                case "car":
                    String carModel = parameters[2];
                    int carSpeed = Integer.parseInt(parameters[3]);
                    Car car = new Car(carModel, carSpeed);
                    peopleData.get(name).setCar(car);
                    break;
                default:
                    break;
            }
            inputData = scanner.nextLine();
        }
        //"End" Print
        String searchedPerson = scanner.nextLine();
        System.out.println(searchedPerson);
        Person personalDataToPrint = peopleData.get(searchedPerson);
        System.out.println(personalDataToPrint);
    }
}
