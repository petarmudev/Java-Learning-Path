package L11_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Task04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Double, Double> addVat = e -> 1.2 * e;
        Consumer<Double> printNumberWithVAT = number -> System.out.printf("%.2f%n", number);

        String[] numbers = scanner.nextLine().split(", ");

        System.out.println("Prices with VAT:");
        Arrays.stream(numbers)
                .map(Double::parseDouble)
                .map(addVat)
                .forEach(printNumberWithVAT);

    }
}
