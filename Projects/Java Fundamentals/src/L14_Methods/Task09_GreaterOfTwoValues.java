package L14_Methods;

import java.util.Scanner;

public class Task09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        if (type.equals("int")) {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());
            System.out.println(compareOneTwo(firstNumber, secondNumber));
        } else if (type.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.println(compareOneTwo(a, b));

        } else if (type.equals("string")) {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            System.out.println(compareOneTwo(firstString, secondString));

        }

    }

    public static int compareOneTwo(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char compareOneTwo(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    public static String compareOneTwo(String firstString, String secondString) {
        if (firstString.compareTo(secondString) > 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}
