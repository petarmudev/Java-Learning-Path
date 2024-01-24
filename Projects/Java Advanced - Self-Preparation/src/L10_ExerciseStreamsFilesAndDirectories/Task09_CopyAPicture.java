package L10_ExerciseStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task09_CopyAPicture {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathOrigin = "C:\\Users\\Petar\\Desktop\\ето я пак....jpg";
        String pathCopy = "C:\\Users\\Petar\\Desktop\\ето я пак тая мърша(Copy)....jpg";

        FileInputStream inputStream = new FileInputStream(pathOrigin);
        FileOutputStream outputStream = new FileOutputStream(pathCopy);
        
        int oneByte = inputStream.read();

        while (oneByte >= 0) {
            outputStream.write(oneByte);
            oneByte = inputStream.read();
        }
    }
}
