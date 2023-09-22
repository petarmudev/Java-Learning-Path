package L01_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Zad01_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Четем входни данни
        //2. Пресмятаме колко лева са въведените долари по фиксинг/курс: 1 USD = 1.79549 BGN
        //3. Принтираме резултата.
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);


    }
}
