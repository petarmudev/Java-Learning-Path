package L05_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad04_BackIn_30_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*  Every time John tries to pay his bills, he sees on the cash desk the sign: "I will be back in 30 minutes". One day John was sick of waiting and decided he needed a program that prints the time after 30 minutes. That way he won't have to wait at the desk and come at the appropriate time. He gave the assignment to you, so you have to do it.
                Input
        The input will be on two lines. On the first line, you will receive the hours, and on the second, you will receive the minutes.
                Output
        Print on the console the time after 30 minutes. The result should be in the format "hh:mm". The hours have one or two numbers, and the minutes always have two numbers (with leading zero).
                Constraints
        •	The hours will be between 0 and 23.
        •	The minutes will be between 0 and 59.
        */
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60) + minutes + 30;
        if (totalMinutes > 1440) { //if the hour passes 24h
            hours = 0;
            totalMinutes -= 1440;
            minutes = totalMinutes;
            System.out.printf("%d:%02d", hours, minutes);
        } else {
            System.out.printf("%d:%02d", totalMinutes / 60, totalMinutes % 60);
        }

    }
}
