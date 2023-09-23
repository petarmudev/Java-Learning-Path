package L03_DataTypesAndVariables;

import java.util.Scanner;

public class Zad06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads 3 lines of input. On each line, you get a single character.
        Combine all the characters into one string and print it on the console.
         */

        //char a = scanner.nextLine();

        //System.out.println("Please enter the first character:");
        char firstChar = scanner.nextLine().charAt(0);

        //System.out.println("Please enter the second character:");
        char secondChar = scanner.nextLine().charAt(0);

        //System.out.println("Please enter the third character:");
        char thirdChar = scanner.nextLine().charAt(0);

        System.out.print(firstChar);
        System.out.print(secondChar);
        System.out.print(thirdChar);
    }
}
