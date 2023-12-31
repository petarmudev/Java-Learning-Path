package L11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read two arrays and print on the console whether they are identical or not.
        Arrays are identical if their elements are equal.
        If the arrays are identical, find the sum of the first one and print on the console the following message:
            "Arrays are identical. Sum: {sum}",
        otherwise find the first index where the arrays differ and print on the console following message:
            "Arrays are not identical. Found difference at {index} index."
         */
        int[] arrayOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                sum += arrayOne[i];
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                return;
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
