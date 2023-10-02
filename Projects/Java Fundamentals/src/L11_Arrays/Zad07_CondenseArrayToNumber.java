package L11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program to read an array of integers and condense them by summing adjacent couples of elements until a single integer is obtained.
        For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
         then we sum again all adjacent elements and obtain {12+13} = {25}.
         */
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = 0;
        int lenght = nums.length;
        int[] condensed = new int[lenght];
        while (lenght > 1) {

            condensed[index] = nums[index] + nums[index + 1];
            lenght--;
            nums[lenght] = condensed[lenght];

        }
        for (int number : condensed) {
            System.out.println(number);
        }
    }
}
