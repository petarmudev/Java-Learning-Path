package L09_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Task01_ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String path = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String path = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\input.txt";
        try (FileInputStream fileStream = new FileInputStream(path)) {
            int oneByte = fileStream.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
