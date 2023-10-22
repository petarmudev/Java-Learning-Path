package L21_RegularMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task03_SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String command = input.split(" \\| ")[0];
            String bookName = input.split(" \\| ")[1];

            if (command.contains("Add Book") && !list.contains(bookName)) {
                list.add(0, bookName);
            } else if (command.contains("Take Book")) {
                list.remove(bookName);
            } else if (command.contains("Swap")) {
                String secondBookName = input.split(" \\| ")[2];
                if (list.contains(bookName) && list.contains(secondBookName)) {
                    int firstIndex = list.indexOf(bookName);
                    int secondIndex = list.indexOf(secondBookName);
                    list.set(secondIndex, bookName);
                    list.set(firstIndex, secondBookName);
                }

            } else if (command.contains("Insert")) {
                if (!list.contains(bookName)) {
                    list.add(bookName);
                }
            } else if (command.contains("Check")) {
                int index = Integer.parseInt(input.split(" \\| ")[1]);
                if (index >= 0 && index < list.size()) {
                    System.out.println(list.get(index));
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", list));
    }
}

