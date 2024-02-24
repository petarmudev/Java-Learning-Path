package L20_ExerciseIteratorsComparators_Task01_02_ListyIterator_Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String createInput = scanner.nextLine();
        List<String> data = Arrays.stream(createInput.split("\\s+")).skip(1).collect(Collectors.toList());

        ListyIterator listyIterator = new ListyIterator(data);

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("END")) {
                break;
            }
            switch (command) {
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "PrintAll":
                    try {
                        listyIterator.printAll();
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
            }
        }
    }
}
