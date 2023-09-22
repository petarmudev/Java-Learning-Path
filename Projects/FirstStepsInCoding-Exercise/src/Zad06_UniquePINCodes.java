import java.util.Scanner;

public class Zad06_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumMax = Integer.parseInt(scanner.nextLine());
        int secondNumMax = Integer.parseInt(scanner.nextLine());
        int thirdNumMax = Integer.parseInt(scanner.nextLine());
        //boolean isPrime = true;
        int firstNum = 1;
        int secondNum = 1;
        int thirdNum = 1;
        for (firstNum = 2; firstNum <= firstNumMax; firstNum++) {
            for (secondNum = 2; secondNum <= secondNumMax; secondNum++) {
                for (thirdNum = 2; thirdNum <= thirdNumMax; thirdNum++) {
                    boolean isPrime = true;
                    //проверка дали е просто число
                    for (int i = 2; i < secondNum; i++) {
                        //превим проверка дали можем да раздели целочислено currentNum с i (дали е просто число)
                        if (secondNum % i == 0) {
                            //sumNonPrimeNumbers += currentNumber;
                            isPrime = false;
                            break;
                        }
                    }//проверяваме дали isPrime = ture. Ако е равено - числото е просто.
                    if (isPrime) {
                        if (firstNum % 2 == 0 && thirdNum % 2 == 0) {
                            System.out.printf("%d %d %d%n", firstNum, secondNum, thirdNum);
                        }
                    }
                }
            }
        }
    }
}

