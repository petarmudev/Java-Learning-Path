package L31_RegularExpressions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b"; // +359 2 222 2222 || +359-2-222-2222
        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(text);

        List<String> phoneNumbers = new LinkedList<>();

        while (phoneMatcher.find()) {
            phoneNumbers.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", phoneNumbers));
    }
}
