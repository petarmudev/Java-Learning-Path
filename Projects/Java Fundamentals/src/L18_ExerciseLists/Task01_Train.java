package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        On the first line, you will be given a list of wagons (integers).
        Each integer represents the number of passengers that are currently in each wagon.
        On the next line, you will get the max capacity of each wagon (single integer).
            Until you receive "end" you will be given two types of input:
                *Add {passengers} - add a wagon to the end with the given number of passengers
                *{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
        In the end, print the final state of the train (all the wagons separated by a space)
        -----------------------------------------------------------------------
        Input                                   Output
        -----------------------------------------------------------------------
        32 54 21 12 4 0 23                  72 54 21 12 4 75 23 10 0
        75
        Add 10
        Add 0
        30
        10
        75
        end
        -----------------------------------------------------------------------
        0 0 0 10 2 4                        10 10 10 10 10 10 10
        10
        Add 10
        10
        10
        10
        8
        6
        end
        */
        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int peopleToAdd = Integer.parseInt(command.split(" ")[1]);
                wagons.add(peopleToAdd);

            } else {
                int peopleToBeSeated = Integer.parseInt(command);

                for (int wagon = 0; wagon < wagons.size(); wagon++) {
                    if ((wagons.get(wagon) + peopleToBeSeated) <= maxCapacity) { /* && peopleToBeSeated > 0 */
                        wagons.set(wagon, (wagons.get(wagon) + peopleToBeSeated));
                        /*peopleToBeSeated = 0;*/  //break with this argument + the statement in the for loop, or the lower one
                        break; //break with this, or with the above argument.
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
