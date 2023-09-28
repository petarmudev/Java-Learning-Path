package L08_DataTypesAndVariables;

import java.util.Scanner;

public class Zad08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that  prints whether a given character is upper-case or lower-case
         */
        char input = scanner.nextLine().charAt(0);
        if (Character.isLowerCase(input)) {
            System.out.println("lower-case");
        } else if (Character.isUpperCase(input)) {
            System.out.println("upper-case");
        }
    }
}
