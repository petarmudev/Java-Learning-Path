package L06_NestedLoops_Exercise;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Zad02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        //правим цикъл и преминаваме през всички числа от 1вото, до 2рото

        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++) {

            int firstDigit = currentNumber / 100000;
            int secondDigit = (currentNumber / 10000) % 10;
            int thirdDigit = (currentNumber / 1000) % 10;
            int forthDigit = (currentNumber / 100) % 10;
            int fifthDigit = (currentNumber / 10) % 10;
            int sixthDigit = currentNumber % 10;

            int oddSum = firstDigit + thirdDigit + fifthDigit;
            int evenSum = secondDigit + forthDigit + sixthDigit;
            if (oddSum == evenSum) {
                System.out.print(currentNumber + " ");
            }
        }

    }
}
