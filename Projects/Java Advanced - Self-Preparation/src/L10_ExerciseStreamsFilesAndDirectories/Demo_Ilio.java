package L10_ExerciseStreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo_Ilio {

    public static void main(String[] args) throws IOException {

        String pathIn = "";
        String pathOut = "";
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of(pathIn));

        BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(pathOut));

        String line = bufferedReader.readLine();
        while (line != null) {
            bufferedWriter.write(line);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
