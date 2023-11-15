package L29_ExerciseTextProcessing;

import java.util.Scanner;

public class Task08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Входни данни:
        //1."A12b s17G"
        //2."P34562Z q2576f   H456z"
        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");

        double sum = 0;
        for (String code : codes) {
            //modify number
            double modifiedNumber = modifyNumber(code);
            sum += modifiedNumber;
        }

        System.out.printf("%.2f", sum);
    }

    private static double modifyNumber(String code) {
        char firstOperator = code.charAt(0);
        char secondOperator = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstOperator, ' ')
                .replace(secondOperator, ' ')
                .trim());

        if (Character.isUpperCase(firstOperator)) {
            //todo
            number /= ((int) firstOperator - 64);
        } else if (Character.isLowerCase(firstOperator)) {
            //todo
            number *= ((int) firstOperator - 96);
        }
        if (Character.isUpperCase(secondOperator)) {
            number -= ((int) secondOperator - 64);
        } else if (Character.isLowerCase(secondOperator)) {
            number += ((int) secondOperator - 96);
        }
        return number;
    }
}
