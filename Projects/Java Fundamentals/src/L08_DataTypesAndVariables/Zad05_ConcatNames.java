package L08_DataTypesAndVariables;

import java.util.Scanner;

public class Zad05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Read two names and a delimiter. Print the names joined by the delimiter.

        Examples
        Input	    Output
        John        John->Smith
        Smith
        ->
        -------------------------
        Jan         Jan<->White
        White
        <->
        -------------------------
        Linda       Linda=>Terry
        Terry
        =>
         */
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(name1 + delimiter + name2);
    }
}
