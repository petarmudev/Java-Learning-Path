package L25_AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Double, Integer> counts = new TreeMap<>();

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double num : nums) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.####");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
