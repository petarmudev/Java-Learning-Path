package L06_NestedLoops_Exercise;

import java.util.Scanner;

public class Zad01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int count = 1;
        for (int i = 1; i <= number; i++) {
            if (count > number) {
                break;
            }
            for (int j = 1; j <= i; j++) {

                if (count > number) {
                    break;
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

