package L09_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task06_SortLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\input.txt";
        String pathOut ="C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\06.SortLinesOutput.txt";

        Path inPath = Paths.get(pathIn);
        Path outPath = Paths.get(pathOut);

        try {
            List<String> lines = Files.readAllLines(inPath);
            Collections.sort(lines);
            Files.write(outPath, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
