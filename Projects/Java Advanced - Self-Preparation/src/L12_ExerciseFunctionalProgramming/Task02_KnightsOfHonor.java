package L12_ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Task02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        //Вариант 1
        Consumer<String[]> printSirHonor = namesArray -> {
            for (int i = 0; i < namesArray.length; i++) {
                System.out.println("Sir " + namesArray[i]);
            }
        };
        printSirHonor.accept(names);

        //Вариант 2
        Consumer<String> printSirAndName = name -> System.out.println("Sir " + name);
        Arrays.stream(names).forEach(printSirAndName);

    }
}
