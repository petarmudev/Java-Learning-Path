package L29_ExerciseTextProcessing;

import java.util.Scanner;

public class Task05_V2_MultiplyBigNumber_WithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int leftover = 0;

        for (int position = firstNumber.length() - 1; position > 0; position--) {

            int digit = Integer.parseInt(firstNumber.charAt(position) + "");
            int product = (digit * secondNumber) + leftover;

            leftover = product / 10;
            result.insert(0, product % 10);
        }
        int lastOperationNumber = Integer.parseInt(firstNumber.charAt(0) + "");

        result.insert(0, (lastOperationNumber * secondNumber) + leftover);
//        if (leftover != 0) {
//            result.insert(0, leftover);
//        }
        System.out.println(result);
    }
}
