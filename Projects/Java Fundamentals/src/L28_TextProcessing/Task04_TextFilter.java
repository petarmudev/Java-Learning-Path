package L28_TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            String replacement = genReplacement(word);
            text = text.replace(word, replacement);
        }

        System.out.println(text);
    }

    private static String genReplacement(String word) {
        char[] replacementChar = new char[word.length()];
        Arrays.fill(replacementChar, '*');
        return new String(replacementChar);
    }
}
