package L29_ExerciseTextProcessing;

import java.util.Scanner;

public class Task07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //"abv>1>1>2>2asdasd"
        StringBuilder text = new StringBuilder(input);
        int totalStrenght = 0;

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == '>') {
                int explosionStrenght = Integer.parseInt(text.charAt(index + 1) + "");
                totalStrenght += explosionStrenght;
            } else if (currentSymbol != '>' && totalStrenght > 0) {
                text.deleteCharAt(index);
                totalStrenght--;
                index--;
            }
        }
        System.out.println(text);
    }
}
