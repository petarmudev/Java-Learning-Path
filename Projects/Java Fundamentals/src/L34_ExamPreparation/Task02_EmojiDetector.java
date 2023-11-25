package L34_ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        //long threshold = 1L;
        int threshold = getThreshold(input);

        System.out.printf("Cool threshold: %d%n", threshold);
        Matcher matcher = pattern.matcher(input);
        int countOfFound = getMatchesCount(input, regex);

        System.out.printf("%d emojis found in the text. The cool ones are:%n", countOfFound);
        while (matcher.find()) {
            int sumOfCharCodes = 0;
            for (char symbol : matcher.group().toCharArray()) {
                if (Character.isLetter(symbol)) {
                    sumOfCharCodes += (int) symbol;
                }
            }
            if (sumOfCharCodes >= threshold) {
                System.out.println(matcher.group());
            }
        }
    }

    private static int getMatchesCount(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int countOfFound = 0;
        while (matcher.find()) {
            countOfFound++;
        }
        return countOfFound;
    }

    private static int getThreshold(String input) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        int total = 1;
        while (matcher.find()) {
            String digit = matcher.group();
            total *= Integer.parseInt(digit);
        }
        return total;
    }
}
