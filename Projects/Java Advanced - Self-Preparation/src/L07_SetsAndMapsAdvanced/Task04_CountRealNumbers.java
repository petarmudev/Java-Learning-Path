package L07_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> occurances = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (occurances.containsKey(numbers[i])) {
                int currentCount = occurances.get(numbers[i]);
                currentCount++;
                occurances.put(numbers[i], currentCount);
            } else {
                occurances.put(numbers[i], 1);
            }
        }

        for (Double number : occurances.keySet()) {
            System.out.printf("%.1f -> %d%n", number, occurances.get(number));
        }
    }
}
