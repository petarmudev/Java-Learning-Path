package L14_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));
    }

    public static double mathPower(double number, int power) {
        //double result = Math.pow(number, power);
        //for (int i = 0; i < power; i++)
        //  result *= number;
        return Math.pow(number, power);
    }
}
