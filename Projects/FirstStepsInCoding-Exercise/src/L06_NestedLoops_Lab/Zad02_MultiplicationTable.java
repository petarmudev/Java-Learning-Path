package L06_NestedLoops_Lab;

import java.util.Scanner;

public class Zad02_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
