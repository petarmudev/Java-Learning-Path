package L12_ExerciseArrays;

import java.util.Scanner;

public class Zad04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] stringNumbers = scanner.nextLine().split(" ");
        int rotationCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotationCount; i++) {
            String firstElement = stringNumbers[0];
            for (int j = 0; j < stringNumbers.length - 1; j++) {
                stringNumbers[j] = stringNumbers[j+1];
            }
            stringNumbers[stringNumbers.length-1] = firstElement;
        }
        for (String element:stringNumbers) {
            System.out.print(element + " ");
        }
    }
}
