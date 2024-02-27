package L05_Encapsulation.Task04_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> players = new ArrayList<>();
        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);
            Person personToAdd = new Person(firstName, lastName, age, salary);
            players.add(personToAdd);
        }

        //This should work:

        Team team = new Team("Black Eagles");
        for (Person person : players) {
            team.addPlayer(person);
        }

//        //This should NOT be working:
//        Team team2 = new Team("Black Eagles - 2");
//        for (Person player : players) {
//            if (player.getAge() < 40) {
//                team.getFirstTeam().add(player);
//            } else {
//                team.getReserveTeam().add(player);
//            }
//        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
