package L11_Arrays;

import java.util.Scanner;

public class Zad04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reversed = new String[elements.length];

        int reversedIndex = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            reversed[reversedIndex] = elements[i];
            reversedIndex += 1;
        }

        System.out.println(String.join(" ", reversed));
    }
}
