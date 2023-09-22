package L04_ForLoop_Lab;

import java.util.Scanner;

public class Zad03_Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 1; num <=n; num += 3) {
            System.out.println(num);
        }
    }
}
