package L05_BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            /*A theatre is having a ticket sale, but they need a program to calculate the price of a single ticket. If the given age does not fit one of the categories, you should print "Error!". You can see the prices in the table below:
    Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
    Weekday	         12$             18$             12$
    Weekend	         15$	         20$	         15$
    Holiday	          5$	         12$	         10$
        Input
    The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
        Output
    Print the ticket price according to the table, or "Error!" if the age is not in the table.
    Constraints
    •	The age will be in the interval [-1000…1000].
    •	The type of day will always be valid.
    Examples
    Input	Output		Input	Output		Input	Output		Input	Output
    Weekday 18$        Holiday  Error!      Holiday 5$          Weekend  15$
    42                  -12                 15                   122
        */
        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        switch (typeOfDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    System.out.println("12$");
                } else if (age > 18 && age <= 64) {
                    System.out.println("18$");
                } else if (age > 64 && age <= 122) {
                    System.out.println("12$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    System.out.println("15$");
                } else if (age > 18 && age <= 64) {
                    System.out.println("20$");
                } else if (age > 64 && age <= 122) {
                    System.out.println("15$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    System.out.println("5$");
                } else if (age > 18 && age <= 64) {
                    System.out.println("12$");
                } else if (age > 64 && age <= 122) {
                    System.out.println("10$");
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
