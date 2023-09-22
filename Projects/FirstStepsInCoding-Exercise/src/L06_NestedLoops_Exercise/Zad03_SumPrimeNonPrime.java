package L06_NestedLoops_Exercise;

import java.util.Scanner;

public class Zad03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);

            boolean isPrime = true;
            if (currentNumber < 0) {  //проверяваме за отрицателно число
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < currentNumber; i++) {
                //превим проверка дали можем да раздели целочислено currentNum с i (дали е просто число)
                if (currentNumber % i == 0) {
                    sumNonPrimeNumbers += currentNumber;
                    isPrime = false;
                    break;
                }
            }//проверяваме дали isPrime = ture. Ако е равено - числото е просто.
            if (isPrime) {
                sumPrimeNumbers += currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);

    }
}
