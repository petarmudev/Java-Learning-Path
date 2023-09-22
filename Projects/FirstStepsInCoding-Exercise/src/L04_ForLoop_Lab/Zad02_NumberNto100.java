package L04_ForLoop_Lab;

import java.util.Scanner;

public class Zad02_NumberNto100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for ( int num = Integer.parseInt(scanner.nextLine()); num >=1; num--) {
            System.out.println(num);
        }
    }
}
