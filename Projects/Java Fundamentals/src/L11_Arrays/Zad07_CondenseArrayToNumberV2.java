package L11_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Zad07_CondenseArrayToNumberV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program to read an array of integers and condense them by summing adjacent couples of elements until a single integer is obtained.
        For example, if we have 3 elements {2, 10, 3}, we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
         then we sum again all adjacent elements and obtain {12+13} = {25}.
         */
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = nums.length;

        while (length > 1) {
            int[] condensed = new int[length - 1];
            for (int i = 0; i < length - 1; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }
            nums = condensed;  // Update nums to the condensed array
            length--;
        }

        System.out.println(nums[0]); // The result is in the first (and only) element of nums
    }
}