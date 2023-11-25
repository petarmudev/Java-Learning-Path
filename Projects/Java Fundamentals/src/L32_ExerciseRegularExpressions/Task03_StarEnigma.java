package L32_ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attackersPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
//            int count = getCount(input);
            String decryptedText = getDecryptedText(input);
            Matcher matcher = pattern.matcher(decryptedText);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")) {
                    //атакуваща планета
                    attackersPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    //унищожена планета
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets); //сортираме планетите по име
        attackersPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets); //сортираме планетите по име
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDecryptedText(String input) {
        int count = getCount(input);
        String decryptedText = "";
        for (char symbol : input.toCharArray()) {
            decryptedText += (char) (symbol - count);
            //System.out.print(decryptedText);
        }
        return decryptedText.toString();
    }

    private static int getCount(String input) {
        int count = 0;
        for (char symbol : input.toLowerCase().toCharArray()) {
            if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r') {
                count++;
            }
        }
        return count;
    }
}
