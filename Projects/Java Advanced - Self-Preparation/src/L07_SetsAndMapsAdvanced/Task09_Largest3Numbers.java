package L07_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;

public class Task09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((left, right) -> right.compareTo(left))
                .limit(3)
                .forEach(number -> System.out.printf("%d ", number));

    }
}
