package L12_ExerciseFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peopleAttending = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        Predicate<String> predicate = null;

        while (!"Party!".equals(line)) {
            //line: "Remove StartsWith P"  ; "Double StartsWith Pete"  ;  "Double Length 5"

            //Action:   Double / Remove
            String command = line.split("\\s+")[0];
            //Condition:    StartsWith / EndsWith / Lenght
            String condition = line.split("\\s+")[1];

            String criteria = line.split("\\s+")[2];

            //Set the predicate condition
            if (line.contains("Length")) {
                predicate = x -> x.length() == Integer.parseInt(criteria);
            } else if (line.contains("StartsWith")) {
                predicate = x -> x.startsWith(criteria);
            } else if (line.contains("EndsWith")){
                predicate = x -> x.endsWith(criteria);
            }

            if (command.equals("Double")) {
                List<String> toAdd = new ArrayList<>();
                for (String name : peopleAttending) {
                    if (predicate.test(name)) {
                        toAdd.add(name);
                    }
                }
                peopleAttending.addAll(toAdd);

            } else if (command.equals("Remove")) {
                List<String> toRemove = new ArrayList<>();
                for (String name : peopleAttending) {
                    if (predicate.test(name)) {
                        toRemove.add(name);
                    }
                }
                peopleAttending.removeAll(toRemove);
            }
            line = scanner.nextLine();
        }
        if (peopleAttending.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(peopleAttending.stream().sorted()
                    .collect(Collectors.toList())
                    .toString()
                    .replaceAll("\\[", "")
                    .replaceAll("\\]", "")
                    + " are going to the party!");
        }

    }
}
