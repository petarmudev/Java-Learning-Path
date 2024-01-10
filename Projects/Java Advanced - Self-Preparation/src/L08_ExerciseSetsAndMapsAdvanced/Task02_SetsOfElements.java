package L08_ExerciseSetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < sizeFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < sizeSecondSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        //Първи начин:
//        Set<Integer> duplicates = new LinkedHashSet<>();
////
////        for (Integer number : firstSet) {
////            if (secondSet.contains(number)) {
////                duplicates.add(number);
////            }
////        }
////        duplicates.forEach(el -> System.out.print(el + " "));

        //Втори начин:
        firstSet.retainAll(secondSet);
        firstSet.forEach(el -> System.out.print(el + " "));

    }
}
