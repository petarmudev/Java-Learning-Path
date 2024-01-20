package L10_ExerciseStreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Path.*;

public class Task03_ALLCAPITALS {
    public static void main(String[] args) {

        String pathIn = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        //Начин 1:
        try {
            List<String> allLines = Files.readAllLines(Path.of(pathIn));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut));
            for (String line : allLines) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Начин 2:
        try (BufferedReader bufReader = new BufferedReader(new FileReader(pathIn));
             BufferedWriter bufWriter = new BufferedWriter(new FileWriter(pathOut))) {

            String line = bufReader.readLine();

            while (line != null) {
                bufWriter.write(line.toUpperCase());
                bufWriter.newLine();
                line = bufReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Exception found!");
        }

    }
}
