package L10_ExerciseStreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task01_SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //1 Прочетем всички редове от файла
        //2. Обходим всеки един ред, намирам сумата на ASCII елементите и принтирам

        String path = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        //Вариант 1:
        for (String line : allLines) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                sum += currentSymbol;
            }
            System.out.println(sum);
        }
        System.out.println("*************");

        //Вариант 2:

        allLines.stream().map(line -> line.toCharArray()).forEach(array -> {
            int sum = 0;
            for (char symbol : array) {
                sum += symbol;
            }
            System.out.println(sum);
        });
    }
}
