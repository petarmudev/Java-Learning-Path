package L05_WhileLoop;

import java.util.Scanner;

public class Zad03_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете цяло число от конзолата и на всеки следващ ред цели числа, докато тяхната сума стане
        // по-голяма или равна на първоначалното число. След приключване на четенето да се отпечата сумата на въведените числа.

        int num = Integer.parseInt(scanner.nextLine());
        int sumOfInput = 0;
        while (sumOfInput < num) {
            sumOfInput += Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sumOfInput);
    }
}
