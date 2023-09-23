package L03_DataTypesAndVariables;

import java.util.Scanner;

public class Zad02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //convert pounds to dollars  1 British Pound = 1.36 Dollars
        double pounds = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", pounds * 1.36);
    }
}
