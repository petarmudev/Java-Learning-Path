package L09_ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Zad001_IntegerOperationsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i <= 4; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i == 1) {
                num = currentNum;
            } else if (i == 2) {
                num = num + currentNum;
            } else if (i == 3) {
                num = num / currentNum;
            } else if (i == 4) {
                num = num * currentNum;
            }
        }
        System.out.println(num);
    }
}
