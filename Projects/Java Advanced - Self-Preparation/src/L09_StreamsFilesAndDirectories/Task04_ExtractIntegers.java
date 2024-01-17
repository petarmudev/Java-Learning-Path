package L09_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task04_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String pathIn = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\input.txt";
        String pathOut = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\04.ExtractIntegersOutput.txt";


        Scanner reader = new Scanner(new FileInputStream(pathIn));
        PrintWriter writer = new PrintWriter(new FileOutputStream(pathOut));

        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                int myNumber = reader.nextInt();
                //System.out.println(myNumber);
                writer.println(myNumber);
            }
            reader.next();
        }
        writer.close();
    }
}