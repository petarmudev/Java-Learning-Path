package L04_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You have a water tank with a capacity of 255 liters.
        On the next n lines, you will receive liters of water, which you must pour into your tank.
        If the capacity is not enough, print "Insufficient capacity!" and continue reading the next line.
        On the last line, print the liters in the tank.

            Input
        The input will be on two lines:
            •	On the first line, you will receive n – the number of lines, which will follow
            •	On the next n lines – you receive quantities of water, which you have to pour into the tank
            Output
        Every time you do not have enough capacity in the tank to pour the given liters, print:
            "Insufficient capacity!".
        On the last line, print only the liters in the tank.
            Constraints
            •	n will be in the interval [1…20].
            •	liters will be in the interval [1…1000].
         */

        int waterTank = 255;
        int numOfInput = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= numOfInput ; i++) {
            int inputQuantity = Integer.parseInt(scanner.nextLine());
            if (sum + inputQuantity > waterTank) {
                System.out.println("Insufficient capacity!");
                continue;
            }else {
                sum +=inputQuantity;
            }

        }
        int diff = Math.abs(waterTank - sum);
        System.out.println(sum);
    }
}
