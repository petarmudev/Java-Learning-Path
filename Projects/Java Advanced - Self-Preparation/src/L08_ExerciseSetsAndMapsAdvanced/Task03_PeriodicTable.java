package L08_ExerciseSetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueElements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            uniqueElements.addAll(Arrays.asList(elements));
        }

        uniqueElements.forEach(el -> System.out.print(el + " "));
    }
}
