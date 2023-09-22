package L04_ForLoop_Lab;

import java.util.Scanner;

public class Zad04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int step = 0; step <= num; step += 2) {
            System.out.println(Math.pow(2, step));
        }
    }
}
