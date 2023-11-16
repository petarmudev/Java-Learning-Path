package L31_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03_MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that matches a date in the format "dd{separator}MMM{separator}yyyy".
        Use named capturing groups in your regular expression.
        */
        String input = scanner.nextLine();

        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n"
                    , matcher.group("day"), matcher.group("month"), matcher.group("year"));
        }
    }
}
