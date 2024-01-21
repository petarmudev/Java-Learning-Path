package L10_ExerciseStreamsFilesAndDirectories;

import javax.swing.plaf.basic.BasicColorChooserUI;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task02_SumBytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        long sum = 0;

        //Начин 1:

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    sum += symbol;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("You have IOException!");
        }

        //Начин 2:
        try {
            byte[] allBytes = Files.readAllBytes(Path.of(path));
            sum = 0;
            for (byte ascii : allBytes) {
                if (ascii != 10 && ascii != 13) {  // ASCII 10 -> New line -> (/n)    ASCII 13 -> Carriage return -> (/r)
                    sum += ascii;
                }
            }
            System.out.println(sum);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
