package L10_ExerciseStreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task05_LineNumbers {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut = "Task05_output.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathIn));

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut));
        PrintWriter writer = new PrintWriter(pathOut);

        int number = 1;
        for (String line : allLines) {
            writer.println(number + ". " + line);
            number++;
        }
        writer.close();
    }
}
