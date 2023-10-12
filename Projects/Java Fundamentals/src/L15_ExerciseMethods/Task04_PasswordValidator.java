package L15_ExerciseMethods;

import java.util.Scanner;

public class Task04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that checks if a given password is valid. Password rules are:
                * 6 – 10 characters (inclusive);
                * Consists only of letters and digits;
                * Have at least 2 digits.
        If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule, print a message:
                "Password must be between 6 and 10 characters"
                "Password must consist only of letters and digits"
                "Password must have at least 2 digits"
        */

        String password = scanner.nextLine().toUpperCase();
        boolean isOkay = true;
        if (!checkPasswordLenght(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isOkay = false;
        }

        if (!checkForDigitsAndLettersOnly(password)) {
            System.out.println("Password must consist only of letters and digits");
            isOkay = false;
        }
        if (!checkForAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
            isOkay = false;
        }
        if (isOkay) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkPasswordLenght(String password) {
        if (password.length() > 10 || password.length() < 6) {
            return false;
        }
        return true;
    }

    public static boolean checkForDigitsAndLettersOnly(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 64 && password.charAt(i) < 91 || password.charAt(i) > 47 && password.charAt(i) < 58) {
                continue;
            } else {
                return false;
            }

        }
        return true;
    }

    public static boolean checkForAtLeast2Digits(String password) {
        int count2Digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > 47 && password.charAt(i) < 58) {
                count2Digits++;
            }
        }
        if (count2Digits >= 2) {
            return true;
        }
        return false;
    }
}
