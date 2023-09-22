package L04_ForLoop_Lab;

import java.util.Scanner;

public class Zad10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {

            int currentValue = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) evenSum +=currentValue;
            else  oddSum +=currentValue;
        }
        if (evenSum == oddSum){
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }
    }
}
