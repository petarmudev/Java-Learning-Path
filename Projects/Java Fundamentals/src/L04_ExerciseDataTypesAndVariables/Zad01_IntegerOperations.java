package L04_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read four integer numbers. Add the first to the second, divide (integer) the sum by the third number,
         and multiply the result by the fourth number. Print the result.
        Constraints
        •	The four numbers from the input are in the range [-2,147,483,648… 2,147,483,647].

        Input	Output		Input	Output
        10      30          15       42
        20                  14
        3                   2
        3		            3

        */

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        System.out.println(((num1+num2) / num3) * num4);

    }
}
