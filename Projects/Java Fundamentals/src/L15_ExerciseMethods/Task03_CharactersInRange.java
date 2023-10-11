package L15_ExerciseMethods;

import java.util.Scanner;

public class Task03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a method that receives two characters and prints all the characters in between them
         on a single line according to ASCII.
         Hint:
         always start from the lower value char and print to the greater char.
         */
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        printCharsInTheRange(firstChar, secondChar);
    }

    public static void printCharsInTheRange(char firstSymbol, char secondSymbol) {

        if (firstSymbol < secondSymbol) {
            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
