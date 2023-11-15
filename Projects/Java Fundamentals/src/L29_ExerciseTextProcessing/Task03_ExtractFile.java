package L29_ExerciseTextProcessing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] filePath = input.split("\\\\");
        String fileName = filePath[filePath.length - 1];
        String file = fileName.split("\\.")[0];
        String fileExtension = fileName.split("\\.")[1];
        System.out.printf("File name: %s%n", file);
        System.out.printf("File extension: %s", fileExtension);
    }
}
