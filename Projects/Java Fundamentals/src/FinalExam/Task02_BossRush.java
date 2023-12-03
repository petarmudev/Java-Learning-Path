package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02_BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        String regex = "\\|(?<bossName>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+\\s[A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < numberOfInputs; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                //"{boss name}, The {title}
                //>> Strength: {length of the name}
                //>> Armor: {length of the title}"
                String name = matcher.group("bossName");
                String title = matcher.group("title");

                System.out.printf("%s, The %s%n" +
                        ">> Strength: %d%n" +
                        ">> Armor: %d%n", name, title, name.length(), title.length());
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
