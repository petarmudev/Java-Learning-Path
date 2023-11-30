package Fund_Exams_03ProgrammingFundamentalsFinalExamRetake;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(\\@|\\#)(?<firstWord>[A-Za-z]{3,})\\1{2}(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalPairsFound = 0;

        Map<String, String> pairs = new LinkedHashMap<>();
        while (matcher.find()) {
            totalPairsFound++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            String secondWordReversed = new StringBuilder(matcher.group("secondWord")).reverse().toString();
            //System.out.println(matcher.group());
            if (firstWord.equals(secondWordReversed)) {
                pairs.put(firstWord, secondWord);
            }
        }
        //Print
        if (totalPairsFound == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", totalPairsFound);
        }

        List<String> printResult = new ArrayList<>();

        if (pairs.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            pairs.entrySet().forEach(entry -> {
                String firstWord = entry.getKey();
                String secondWord = entry.getValue();
                printResult.add(firstWord + " <=> " + secondWord);
            });
            //{wordOne} <=> {wordtwo}, {wordOne} <=> {wordtwo}, … {wordOne} <=> {wordtwo}");
        }
        System.out.println(String.join(", ", printResult));
    }
}
