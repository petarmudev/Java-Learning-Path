package L09_StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task07_ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files\\Files-and-Streams";

        File file = new File(path);

        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (!f.isDirectory()) {
                        // f.lenght -> String fileSizeBytes = String.valueOf(f.length()); //Връща размера на файла в байтове
                        System.out.printf("%s: [%s]%n", f.getName(), f.length()); //Can replace f.lenght with fileSizeBytes променливата
                    }
                }
            }
        }
    }
}
