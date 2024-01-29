package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task11_Bonus_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        HashMap<String, Predicate> predicatesMap = new HashMap<>();
        String input = scanner.nextLine();

        while (!"Print".equals(input)) {
            String[] tokens = input.split(";");

            String command = tokens[0];
            String conditionKey = tokens[1];
            String conditionValue = tokens[2];
            String name = conditionKey + conditionValue;
            //Input:    "Add filter;Starts with;M"     || ""Remove filter;Starts with;M"  || Add filter;Contains;M

            if (command.equals("Add filter")) {
                Predicate<String> predicate = null;
                switch (conditionKey) {
                    case "Starts with":
                        predicate = pr -> pr.startsWith(conditionValue);
                        predicatesMap.putIfAbsent(name, predicate);
                        break;
                    case "Ends with":
                        predicate = pr -> pr.endsWith(conditionValue);
                        predicatesMap.putIfAbsent(name, predicate);
                        break;
                    case "Lenght":
                        predicate = pr -> pr.length() == Integer.parseInt(conditionValue);
                        predicatesMap.putIfAbsent(name, predicate);
                        break;
                    case "Contains":
                        predicate = pr -> pr.contains(conditionValue);
                        predicatesMap.putIfAbsent(name, predicate);
                        break;
                    default:
                        break;
                }
            } else {    //Remove filter;Starts with(Ends with);M
                predicatesMap.remove(name);
            }
            input = scanner.nextLine();
        }

        for (String guest : guests) {
            boolean isGoing = true;
            for (String entry : predicatesMap.keySet()) {
                if (predicatesMap.get(entry).test(guest)) {
                    isGoing = false;
                    break;
                }
            }
            if (isGoing) {
                System.out.print(guest + " ");
            }
        }
    }
}
