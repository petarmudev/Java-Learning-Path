package L17_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = new ArrayList<>(Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        if (numbers.size() % 2 != 0) {
            numbers.add((numbers.size() / 2 + 1), 0);
        }
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            int numberCurrentIdx = numbers.get(i);
            int numberLastIdx = numbers.get(numbers.size() - 1);
            numbers.set(i, (numberCurrentIdx + numberLastIdx));
            numbers.remove((numbers.size() - 1));

        }
        System.out.println(numbers.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
        // System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));


    }
}
