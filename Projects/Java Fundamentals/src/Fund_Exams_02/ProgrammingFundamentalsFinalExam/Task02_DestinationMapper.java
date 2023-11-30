package Fund_Exams_02.ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int totalWordsLenght = getDestinationWordsLenght(input, pattern);
        List<String> destinations = new ArrayList<>();

        //Print
        //"Destinations: {destinations joined by ', '}"
        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
        }
        System.out.print("Destinations: ");
        System.out.println(destinations.toString().replaceAll("[\\[\\]]", ""));
        System.out.printf("Travel Points: %s%n", totalWordsLenght);

    }

    private static int getDestinationWordsLenght(String input, Pattern pattern) {
        int totalSum = 0;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            totalSum += matcher.group("destination").length();
        }
        return totalSum;
    }
}
