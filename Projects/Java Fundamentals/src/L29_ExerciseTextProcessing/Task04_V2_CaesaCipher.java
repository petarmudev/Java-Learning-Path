package L29_ExerciseTextProcessing;

import java.util.Scanner;

public class Task04_V2_CaesaCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptSymbol = (char) (symbol+3);
            encryptText.append(encryptSymbol);
        }
        System.out.println(encryptText);
    }
}
