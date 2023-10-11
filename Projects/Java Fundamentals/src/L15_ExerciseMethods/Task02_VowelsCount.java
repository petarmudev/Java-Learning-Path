package L15_ExerciseMethods;

import java.util.Scanner;

public class Task02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a method that receives a single string and prints the count of the vowels.
        Use an appropriate name for the method.
        */

        String text = scanner.nextLine();
        findCountVowels(text.toLowerCase());
    }

    public static void findCountVowels(String text) {
        int count = 0;

        for (char letter : text.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
