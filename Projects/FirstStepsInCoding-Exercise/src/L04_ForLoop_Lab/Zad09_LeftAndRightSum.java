package L04_ForLoop_Lab;

import java.util.Scanner;

public class Zad09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int leftNumbers = Integer.parseInt(scanner.nextLine());
            leftSum += leftNumbers;
        }
        for (int i = 0; i < n; i++) {
            int rightNumbers = Integer.parseInt(scanner.nextLine());
            rightSum += rightNumbers;
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
    }
}
