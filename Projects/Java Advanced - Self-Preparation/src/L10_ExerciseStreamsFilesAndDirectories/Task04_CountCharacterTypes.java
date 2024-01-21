package L10_ExerciseStreamsFilesAndDirectories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task04_CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        //Glasni : a, e, i, o, u
        //Пунктуажионни знаци: ! , . ?
        //Съгласни: всичко останало.  БЕЗ интервали

        int vowelsCount = 0;        //брой гласни букви (само малките)
        int punctCount = 0;         //пунктуационни знаци
        int othersSymbolCount = 0;   //брой други

        String pathIn = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "C:\\Users\\Petar\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathIn));

        for (String line : allLines) {

            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                if (currentSymbol == ' ') { //Ако е интервал пропускаме итерацията
                    continue;
                }
                //Проверка на символа
                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i'
                        || currentSymbol == 'o' || currentSymbol == 'u') {
                    vowelsCount++;
                } else if (currentSymbol == ',' || currentSymbol == '.' || currentSymbol == '!' || currentSymbol == '?') {
                    punctCount++;
                } else {
                    othersSymbolCount++;
                }
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathOut));
        bufferedWriter.write("Vowels: " + vowelsCount);
        bufferedWriter.newLine();
        bufferedWriter.write("Other symbols: " + othersSymbolCount);
        bufferedWriter.newLine();
        bufferedWriter.write("Punctuation: " + punctCount);
        bufferedWriter.close();
    }
}
