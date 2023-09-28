package L09_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // char symbol = 65;
       // System.out.println(symbol);
       // System.out.println((int) symbol);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 'a'; i < 'a' +n ; i++) {
            for (int j = 'a'; j <'a'+ n; j++) {
                for (int k = 'a'; k < 'a'+n; k++) {

                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}

