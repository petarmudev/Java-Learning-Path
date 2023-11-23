package L32_ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexOld = "\\%(?<user>[A-Z][a-z]+)\\%\\<" +
                "(?<item>[A-Z][a-z]+)\\>[a-z]*\\|" +
                "(?<amount>[0-9]+)\\|[a-z]*" +
                "(?<price>[0-9]+\\.?[0-9]?)\\$";

        String regexOld2 = "\\%(?<user>[A-Z][a-z]+)\\%([^\\|\\$\\%\\.0-9)])*\\<" +
                "(?<item>[A-Z][a-z]+)\\>([^\\|\\$\\%\\.0-9)]*)[a-z]*\\|" +
                "(?<amount>[0-9]+)\\|([^\\|\\$\\%\\.0-9)])*" +
                "(?<price>[0-9]+\\.?[0-9]?)\\$";
        String regex = "%(?<user>[A-Z][a-z]+)%" +
                "[^\\|$%\\.]*" +
                "<(?<item>\\w+)>" +
                "[^\\|\\$%\\.]*" +
                "\\|(?<count>[0-9]+)\\|" +
                "[^\\|\\$%\\.]*?" +
                "(?<price>[0-9]+\\.?[0-9]*)\\$";

        Pattern pattern = Pattern.compile(regex);
        double total = 0;
        while (true) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (input.equals("end of shift")) {
                break;
            }
            if (matcher.find()) {
                double totalPrice = Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price"));
                total += totalPrice;
                System.out.printf("%s: %s - %.2f%n", matcher.group("user"), matcher.group("item"), totalPrice);
            }
        }
        System.out.printf("Total income: %.2f%n", total);
    }
}
