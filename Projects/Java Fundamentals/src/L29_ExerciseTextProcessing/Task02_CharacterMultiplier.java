package L29_ExerciseTextProcessing;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] texts = input.split(" ");

        String firstText = texts[0];
        String secondText = texts[1];

        printSumOfCharCodes(firstText, secondText);

    }

    private static void printSumOfCharCodes(String firstText, String secondText) {
        int firstLenght = firstText.length();
        int secondLenght = secondText.length();

        //кой е по-дългия текст
        int maxLenght = Math.max(firstLenght, secondLenght);
        int minLenght = Math.min(firstLenght, secondLenght);

        int sum = 0;

        for (int position = 0; position < minLenght; position++) {
            sum += firstText.charAt(position) * secondText.charAt(position);
        }
        if (firstLenght == secondLenght) {
            //System.out.println(sum);
        } else if (firstLenght > secondLenght) {
            for (int i = minLenght; i < maxLenght; i++) {
                sum += firstText.charAt(i);
            }
        } else {
            for (int i = minLenght; i < maxLenght; i++) {
                sum += secondText.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
