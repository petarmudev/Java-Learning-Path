package L26_ExerciseAssociativeArrays;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task01_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        String text = scanner.nextLine();
        for (char symbol : text.toCharArray()) {
            //1. пропускаме ако е интервал(по условие)
            if (symbol == ' ') {
                continue;
            } //2 проверка дали сме срешнали вече тази буква
            //2.1 Не сме срешали
            if ((!symbolCount.containsKey(symbol))) {
                symbolCount.put(symbol, 1);
            } //2.2 Вече сме срещали символа
            else {
                symbolCount.put(symbol, symbolCount.get(symbol) + 1);
            }
        }
        //Принт
        //1ви начин
        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //System.out.println();

        //2ри начин със Stream API
        //symbolCount.entrySet()
        //        .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        //3. Начин
        symbolCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
