package L08_DataTypesAndVariables;

import java.util.Scanner;

public class Zad07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
        */
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdChar, secondChar, firstChar);

    }
}
