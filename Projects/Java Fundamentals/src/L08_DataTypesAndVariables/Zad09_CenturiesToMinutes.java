package L08_DataTypesAndVariables;

import java.util.Scanner;

public class Zad09_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
      Write a program to enter an integer number of centuries and convert it to years, days, hours, and minutes.
         */
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                centuries,
                years,
                days,
                hours,
                minutes);
    }
}
