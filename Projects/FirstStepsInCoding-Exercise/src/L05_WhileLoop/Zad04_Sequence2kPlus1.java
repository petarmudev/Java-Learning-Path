package L05_WhileLoop;

import java.util.Scanner;

public class Zad04_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=num; i= (i * 2)+1) {
            System.out.println(i);
        }
    }
}
