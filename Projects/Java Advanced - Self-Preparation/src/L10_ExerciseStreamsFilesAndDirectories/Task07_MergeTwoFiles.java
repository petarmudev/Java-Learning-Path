package L10_ExerciseStreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String pathInputOne = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathInputTwo = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathOutput = "Task07_mergedOutput.txt";

        //Начин 1:
//        List<String> inputOneLines = Files.readAllLines(Path.of(pathInputOne));
//        List<String> inputTwoLines = Files.readAllLines(Path.of(pathInputTwo));
//        PrintWriter writer = new PrintWriter(pathOutput);
//        for (String line : inputOneLines) {
//            writer.println(line);
//        }
//        for (String line : inputTwoLines) {
//            writer.println(line);
//        }
//        writer.close();

        //Начин 2:

        PrintWriter writer = new PrintWriter(pathOutput);

        List<String> inputOneLines = Files.readAllLines(Path.of(pathInputOne));
        inputOneLines.forEach(line -> writer.println(line));
        List<String> inputTwoLines = Files.readAllLines(Path.of(pathInputTwo));
        inputTwoLines.forEach(line -> writer.println(line));
        writer.close();
    }
}
