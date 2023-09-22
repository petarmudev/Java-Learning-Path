package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            /*
            Write a program that determines whether a person is based on the given age: baby, child, teenager, adult, or elder. The bounders are:
    •	0-2 – baby;
    •	3-13 – child;
    •	14-19 – teenager;
    •	20-65 – adult;
    •	>=66 – elder;
    •	All the values are inclusive

        Examples
    Input	Output
    20  	adult
    1   	baby
    100	    elder

         */
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 2) {
            System.out.println("baby");
        } else if (age >= 3 && age <= 13) {
            System.out.println("child");
        } else if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        } else if (age >= 20 && age <= 65) {
            System.out.println("adult");
        } else if (age >= 66) {
            System.out.println("elder");
        }
    }
}
