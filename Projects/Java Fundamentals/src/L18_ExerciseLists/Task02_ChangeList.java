package L18_ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads a list of integers from the console and receives commands which
         manipulate the list. Your program may receive the following commands:
            Delete {element} - delete all elements in the array which are equal to the given element
            Insert {element} {position} - insert element at the given position
        You should stop the program when you receive the command "end".
        Print all numbers in the array, separated with a single whitespace.
        Input                                   Output
        --------------------------------------------------------------------------------
        1 2 3 4 5 5 5 6                         1 2 3 4 5 5 5 6
        Delete 5
        Insert 10 1
        Delete 5
        end
        -----------------------------------------------------------------------
        20 12 4 319 21 31234 2 41 23 4          20 12 50 319 50 21 31234 2 41 23
        Insert 50 2
        Insert 50 5
        Delete 4
        end
         */

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("end")) {

            if (commandInput.contains("Delete")) {
                //Delete 4
                int numberForOperation = Integer.parseInt(commandInput.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForOperation));
            } else if (commandInput.contains("Insert")) {
                //Insert 10 1
                int element = Integer.parseInt(commandInput.split(" ")[1]);
                int position = Integer.parseInt(commandInput.split(" ")[2]);

                numbers.add(position, element);
            }
            commandInput = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
