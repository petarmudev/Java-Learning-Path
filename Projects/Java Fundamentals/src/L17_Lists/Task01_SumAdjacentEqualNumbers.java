package L17_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList()));

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentElement = numbers.get(i);
            double nextElement = numbers.get(i + 1);
            if (currentElement == nextElement) {
                numbers.set(i, (currentElement + nextElement));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        for (Double element : numbers) {
            System.out.print(new DecimalFormat("0.#").format(element) + " ");
        }
    }
}
