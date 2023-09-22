package L04_ForLoop_Exercise;

import java.util.Scanner;

public class Zad02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (max < currentNumber){
                max = currentNumber;
            }
        }
        int sumWithoutMaxNumber = sum - max;
        if (sumWithoutMaxNumber == max){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumWithoutMaxNumber - max));
        }
    }
}