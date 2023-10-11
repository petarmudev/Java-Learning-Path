package L15_ExerciseMethods;

import java.util.Scanner;

public class Task05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        You will receive 3 integers. Write a method sum to get the sum of the first two integers
         and subtract the method that subtracts the third integer from the result from the sum method.
         */
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(sum(firstNumber, secondNumber), thirdNumber));
    }
    public static int sum (int n1, int n2){
        return n1+ n2;
    }

    public static int subtract(int n1, int n2){
        return n1 - n2;
    }
}
