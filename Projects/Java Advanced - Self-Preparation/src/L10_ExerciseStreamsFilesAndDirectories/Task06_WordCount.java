package L10_ExerciseStreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Task06_WordCount {
    public static void main(String[] args) throws IOException {

        String pathWords = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        Map<String, Integer> countWords = new HashMap<>();
        //Прочитам всички думи от файла и всяка дума я съхранявам в МАП-а

        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathWords));

        for (String lineWithWords : allLinesWithWords) {
            //"of which The"
            Arrays.stream(lineWithWords.split("\\s+")).forEach(word -> {
                countWords.put(word, 0);
            });
        }
        String pathTextToSearch = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String pathResult = "Task06_results.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathTextToSearch));
        PrintWriter writer = new PrintWriter(pathResult);

        //Обхождаме всеки един ред-> взимаме всички думи на един ред -> Проверяваме дали думата трябва да я преброим в МАП-а

        List<String> allLines = Files.readAllLines(Path.of(pathTextToSearch));

        for (String line : allLines) {
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (countWords.containsKey(word)) {
                    int currentCount = countWords.get(word);
                    countWords.put(word, currentCount + 1);
                }
            }); //масив от отделните думи
        }

        //Print in DESCENDING order !!!

        //Вариант 1:

        countWords.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(entry -> {
            String word = entry.getKey();
            int count = entry.getValue();
            writer.printf("%s - %d%n", word, count);
        });
        writer.close();

        //Вариант 2:

        PrintWriter printWriter = new PrintWriter(pathResult);
        countWords.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry ->
                printWriter.println(entry.getKey() + " - " + entry.getValue()));
        printWriter.close();

        //Начин на работа на:  .compareTo() -> 0 (равни); 1(първото > второто); -1 (първото < второто)
        //Ако сортед получи като резултат: sorted() <- 0 (не разменя местата на записите); 1 (разменя местата на първото и второто); -1 (не разменя местата на записите)
    }
}
