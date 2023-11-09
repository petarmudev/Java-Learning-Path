package L28_TextProcessing;

import java.util.Scanner;

public class Task01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            String reversedWord = reverseWord(word);
            System.out.printf("%s = %s%n", word, reversedWord);
        }
    }

    private static String reverseWord(String word) {
        char[] reversedResult = new char[word.length()];
        int reversedIdx = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            reversedResult[reversedIdx] = currentChar;
            reversedIdx++;
        }
        return new String(reversedResult);
    }
}
