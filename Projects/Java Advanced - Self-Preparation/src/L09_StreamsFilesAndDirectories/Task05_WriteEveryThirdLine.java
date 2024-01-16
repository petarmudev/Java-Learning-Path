package L09_StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class Task05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathIn = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";


        Scanner in = new Scanner(new FileReader(pathIn));
        PrintWriter out = new PrintWriter(new FileWriter(pathOut));

        int counter = 1;
        String line = in.nextLine();
        while (in.hasNextLine()) {
            if (counter % 3 == 0) {
                out.println(line);
            }
            counter++;
            line = in.nextLine();
        }
        out.close();

    }
}
