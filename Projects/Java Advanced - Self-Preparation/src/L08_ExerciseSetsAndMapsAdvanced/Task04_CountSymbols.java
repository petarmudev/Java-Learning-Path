package L08_ExerciseSetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeMap;

public class Task04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"SoftUni rocks"
        /*
         : 1 time/s
        S: 1 time/s
        U: 1 time/s
        c: 1 time/s
        f: 1 time/s
        i: 1 time/s
        k: 1 time/s
        n: 1 time/s
        o: 2 time/s
        r: 1 time/s
        s: 1 time/s
        t: 1 time/s
         */
        String input = scanner.nextLine();
        char[] inputCharArray = input.toCharArray();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();
        if (!input.isEmpty()) {
            for (char currentSymbol : inputCharArray) {
                if (symbolMap.containsKey(currentSymbol)) {
                    int count = symbolMap.get(currentSymbol);
                    symbolMap.put(currentSymbol, count + 1);
                } else {
                    symbolMap.putIfAbsent(currentSymbol, 1);
                }
            }
        }
        symbolMap.entrySet().forEach(entry -> {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        });
    }
}
