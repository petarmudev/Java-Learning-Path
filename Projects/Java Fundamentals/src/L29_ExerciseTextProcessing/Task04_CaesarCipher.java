package L29_ExerciseTextProcessing;

import java.util.Scanner;

public class Task04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (char symbol : text.toCharArray()) {
            char currentChar = symbol;
            symbol = (char) (currentChar + 3);
            System.out.print(symbol);
        }
    }
}
