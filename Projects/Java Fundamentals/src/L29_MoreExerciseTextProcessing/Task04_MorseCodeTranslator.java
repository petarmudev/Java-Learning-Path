package L29_MoreExerciseTextProcessing;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task04_MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Character> morseToEnglish = new LinkedHashMap<>();
        morseToEnglish.put(".-", 'A');
        morseToEnglish.put("-...", 'B');
        morseToEnglish.put("-.-.", 'C');
        morseToEnglish.put("-..", 'D');
        morseToEnglish.put(".", 'E');
        morseToEnglish.put("..-.", 'F');
        morseToEnglish.put("--.", 'G');
        morseToEnglish.put("....", 'H');
        morseToEnglish.put("..", 'I');
        morseToEnglish.put(".---", 'J');
        morseToEnglish.put("-.-", 'K');
        morseToEnglish.put(".-..", 'L');
        morseToEnglish.put("--", 'M');
        morseToEnglish.put("-.", 'N');
        morseToEnglish.put("---", 'O');
        morseToEnglish.put(".--.", 'P');
        morseToEnglish.put("--.-", 'Q');
        morseToEnglish.put(".-.", 'R');
        morseToEnglish.put("...", 'S');
        morseToEnglish.put("-", 'T');
        morseToEnglish.put("..-", 'U');
        morseToEnglish.put("...-", 'V');
        morseToEnglish.put(".--", 'W');
        morseToEnglish.put("-..-", 'X');
        morseToEnglish.put("-.--", 'Y');
        morseToEnglish.put("--..", 'Z');

        String morseInput = scanner.nextLine();
        String translatedMorseCode = translateMorseCode(morseInput, morseToEnglish);

        System.out.println(translatedMorseCode);
    }

    private static String translateMorseCode(String morseInput, Map<String, Character> morseToEnglish) {
        StringBuilder result = new StringBuilder();
        String[] words = morseInput.split("\\|");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                if (morseToEnglish.containsKey(letter)) {
                    result.append(morseToEnglish.get(letter));
                }
            }
            result.append(" ");
        }
        return new String(result);
    }
}
