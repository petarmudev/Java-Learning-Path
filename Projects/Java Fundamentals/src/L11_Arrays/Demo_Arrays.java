package L11_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Demo_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array numbers, separated by space");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String[] numsToString = Arrays.stream(numbers)
                .mapToObj(e -> String.valueOf(e))
                .toArray(String[]::new);

        String[] arr = {"one", "two"};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, arr[i]);
        }
        System.out.println();

        System.out.println(String.join(" ", numsToString));  //String.join PRINTING Strings

        System.out.println(String.join(" ",                    //String.join Using int Arrays
                Arrays.stream(numbers)
                        .mapToObj(e -> String.valueOf(e))
                        .toArray(String[]::new)));

        String[] days = {"Monday", "Tuesday", "Wednesday"};    //Another example
        System.out.println(String.join(" ", days));

    }
}

