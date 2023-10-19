package L18_ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that keeps track of guests going to a house party.
        On the first input line, you are going to receive how many commands you are going to have.
        On the next lines you are going to receive some of the following inputs:
        "{name} is going!"
        "{name} is not going!"
        If you receive the first type of input, you have to add the person if he/she is not on the list.
        If he/she is in the list, print on the console:
             "{name} is already in the list!". If you receive the second type of input,
        you must remove the person if he/she is on the list. If not, print:
             "{name} is not in the list!". In the end, print all guests.
        */
        List<String> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String name = command.split(" ")[0];
            if (command.contains("is not going!")) {      //name is NOT going
                if (people.contains(name)) {
                    people.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else if (command.contains("is going!")) {   //name is going
                if (people.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    people.add(name);
                }
            }
        }
        for (String person : people) {
            System.out.println(person);
        }
    }
}
