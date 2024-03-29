package L09_StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task08_NestedFolders {
    public static void main(String[] args) {

        String path = "C:\\Users\\Petar\\Documents\\GitHub\\Java-Learning-Path\\Projects\\Java Advanced - Self-Preparation\\src\\L09_StreamsFilesAndDirectories\\Root Files";
        //String path = "C:\\SoftUni\\Files-and-Streams";

        File rootDirectory = new File(path);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(rootDirectory);

        int count = 0;

        while (!dirs.isEmpty()) {
            File currentDirectory = dirs.poll();
            File [] nestedFiles = currentDirectory.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    dirs.offer(nestedFile);
                    count++;
                    System.out.println(nestedFile.getName());
                }
            }
        }
        System.out.println(count + " folders");
    }
}
