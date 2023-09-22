package L02_ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Zad06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program to check whether or not a given number is strong.
         A number is strong if the sum of the Factorial of each digit is equal to the number.
            For example 145 is a strong number, because 1! + 4! + 5! = 145.
         Print "yes" if the number is strong and "no" if the number is not strong.
         */
        int givenNumber = Integer.parseInt(scanner.nextLine());
        int startNumber = givenNumber;
        String sumOfDigits = "";
        int currentDigit = 0;
        int sumOfAll = 0;
        /*for (int position = 0; position < givenNum.length()-1; position++) {
            char currentDigit = givenNum.charAt(position);
            sumOfDigits += currentDigit * currentDigit;
        }                                                                           //Моя си глупост
        if (sumOfDigits.equals(givenNum)) {
            System.out.println("yes");
        } else {
            System.out.println("no"); */

        while (givenNumber > 0) {
            currentDigit = givenNumber % 10;
            int facturiel = 1;
            //todo да сметна фактуриела
            for (int i = 1; i <= currentDigit; i++) {
                facturiel *= i;
            }
            sumOfAll += facturiel;
            givenNumber = givenNumber / 10; //премахваме последната цифра
        }
        if (sumOfAll == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}