package L01_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad02_Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 3.0){
            System.out.println("Passed!");
        }
    }
}
