package L09_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task02_WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathIn = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\input.txt";
        String pathOut = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\02.WriteToFileOutput.txt";
        Set<Character> forbiddenSymbols = new HashSet<>();
        Collections.addAll(forbiddenSymbols, '.', ',', '!', '?');

        try (FileInputStream in = new FileInputStream(pathIn);
             FileOutputStream out = new FileOutputStream(pathOut)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                char myByteAsChar = (char) oneByte;
                if (!forbiddenSymbols.contains(myByteAsChar)) {
                    out.write(oneByte);
                    System.out.print(myByteAsChar);
                }
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
