package L32_ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task04_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputDemons = input.trim().split("\\s*,\\s*");

        for (String demon : inputDemons) {
            int health = getDemonsHealth(demon);
            double damage = getDemonsDamage(demon);

            //Променяме нашият damage, спрямо * и /
            for (char symbol : demon.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }
            //Отпечатване за всеки демон
            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);
        }
    }

    private static int getDemonsHealth(String demon) {
        int health = 0;
        Pattern pattern = Pattern.compile("[^+\\-*/0-9.]");
        Matcher matcher = pattern.matcher(demon.trim());
        while (matcher.find()) {
            health += matcher.group().charAt(0);
        }
        return health;
    }

    private static double getDemonsDamage(String demon) {
        double damage = 0;
        String regex = "-?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(demon);

        while (matcher.find()) {
            damage += Double.parseDouble(matcher.group());
        }
        return damage;
    }
}
