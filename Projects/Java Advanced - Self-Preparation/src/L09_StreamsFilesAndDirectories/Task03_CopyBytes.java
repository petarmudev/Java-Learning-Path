package L09_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task03_CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\input.txt";
        String pathOut = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\03.CopyBytesOutput.txt";

        try (FileInputStream fileInput = new FileInputStream(pathIn);
             FileOutputStream fileOutput = new FileOutputStream(pathOut)) {
            int oneByte = fileInput.read();
            while (oneByte >= 0) {
                if (oneByte == 32 || oneByte == 10) {
                    fileOutput.write(oneByte);
                } else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        fileOutput.write(digits.charAt(i));
                    }
                }
                oneByte = fileInput.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
