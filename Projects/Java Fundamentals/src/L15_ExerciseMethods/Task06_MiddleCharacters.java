package L15_ExerciseMethods;

import java.util.Scanner;

public class Task06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You will receive a single string. Write a method that prints the middle character.
        If the length of the string is even, there are two middle characters.
        */
        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String text) {
        int lenght = text.length();

        if (lenght % 2 == 0) {              //we need to print the two middle letters
            System.out.print(text.charAt(lenght / 2 - 1));
            System.out.print(text.charAt(lenght / 2));
        } else {                            //we print only the one and only middle letter
            System.out.print(text.charAt(lenght / 2));
        }
    }
}
